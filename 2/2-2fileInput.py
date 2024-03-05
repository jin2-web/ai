import cv2 as cv  # opencv 사용
import sys  # 운영체제 사용

img = cv.imread( 'soccer.jpg' )  # 파일 읽기 

if img is None:
    sys.exit( '파일을 찾을 수 없습니다') 

cv.imshow( 'soccer image', img )   # 화면 표시하기  

cv.waitKey()  # 멈추기
cv.destroyAllWindows()    # 닫기    

# 연습문제 이미지2개를 화면 보이기
img1 = cv.imread( 'opencv.png' )
img2 = cv.imread( 'opencv2.jpg' )

if img is None:
    sys.exit( '파일을 찾을 수 없습니다') 

cv.imshow( 'open cv image1', img1 )   # 화면 표시하기  
cv.imshow( 'open cv image2', img2 )

cv.waitKey()  # 멈추기
cv.destroyAllWindows()    # 닫기    

