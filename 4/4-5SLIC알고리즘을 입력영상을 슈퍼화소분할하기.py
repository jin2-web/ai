# 4-5 SLIC 알고리즘으로 입력영상을 슈퍼 화소 분할하기
import skimage
import numpy as np
import cv2 as cv

img = skimage.data.coffee()
cv.imshow( 'Coffee Image', cv.cvtColor(img, cv.COLOR_RGB2BGR ))

slice1 = skimage.segmentation.slic(img, compactness=10, n_segments=200)
# 형식                슈퍼화소분할함수( 영상, 슈퍼화소모양,슈퍼화소갯수  )
sp_img0 = skimage.segmentation.mark_boundaries(img, slice1)
# 분할 정보 저장
sp_img1 = np.uint8(sp_img0*255.0)

slice2 = skimage.segmentation.slic(img, compactness=40, n_segments=900)
sp_img2 = skimage.segmentation.mark_boundaries(img, slice2)
sp_img2 = np.uint8(sp_img2*255.0)

cv.imshow( 'Super pixels  (compact 20)', cv.cvtColor(sp_img1, cv.COLOR_RGB2BGR))
cv.imshow( 'Super pixels  (compact 40)', cv.cvtColor(sp_img2, cv.COLOR_RGB2BGR))

cv.waitKey()
cv.destroyAllWindows()
