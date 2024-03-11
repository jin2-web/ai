# 4-8 이진영역의 특징을 추출하는 함수 사용하기 
import skimage
import numpy as np
import cv2 as cv

orig=skimage.data.horse()
# 말 영역은 255 배경은 0인 영상으로 변환한다.
img = 255-np.uint8(orig)*255 
cv.imshow('Horse', img)


contours,hierachy = cv.findContours(img, cv.RETR_EXTERNAL, cv.CHAIN_APPROX_NONE) # 경계선 구하기
img2 = cv.cvtColor( img, cv.COLOR_GRAY2BGR)
cv.drawContours(img2, contours, -1, (255, 0,255), 2) # 경계선 색칠하고
cv.imshow( 'Horse with contour', img2)

contour = contours[0]
m=cv.moments(contour) # 모멘트 추출
area = cv.contourArea( contour) # 면적 
cx, cy = m['m10'] / m['m00'], m['m01'] / m['m00'] # 중심점
perimeter = cv.arcLength(contour, True) # 둘레 길이 계산
roundness = ( 4.0*np.pi*area) / (perimeter * perimeter ) # 둥근정도계산
print('면적=', area, '\n중점=(', cx, ',', cy, ')', '\n둘레 = ', perimeter, '\n둥근 정도 = ', roundness)

img3 = cv.cvtColor( img, cv.COLOR_GRAY2BGR )
contour_approx = cv.approxPolyDP(contour, 8, True) # 경계선을 직선 근사
#                                        임계값, 폐곡선
cv.drawContours(img, [contour_approx],-1, (0,255,0), 2)

hull = cv.convexHull( contour) # 블록헐
hull = hull.reshape( 1, hull.shape[0], hull.shape[2])
cv.drawContours(img3, hull, -1, (0,0,255), 2)

cv.imshow('Horse with line segements and convex hull', img3)

cv.waitKey()
cv.destroyAllWindows()












