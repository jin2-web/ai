# 단순선형 회귀 분석
# 문제 주행속도와 제동거리사이의 회귀식 구하기
head(cars)
class(cars)
str( cars )
dim( cars )
plot( dist~speed, data=cars )
# 산점도에서 선형관계가 분명하다.
# 주행속도가 증가할수록 제동거리도 증가한다
# 형식 회귀모델 구하는 함수 lm( 종속변수~독립변수, 데이터셋   )
# 회기식은 y = Wx + b
mod1 <- lm( dist~speed, cars)
mod1
coef(mod1)[1] # intercept값이 b이다. 
coef(mod1)[2] # speed 3.932402값이 W이다.
# 그래서 y = 3.932402 X speed - 17.579095 회기식이 구해진다.

# 문 속도가 30일때 제동거리는?
y <- 3.932402 * 30 - 17.579095
y
# 문 속도가 50일때 제동거리는?
y <- 3.932402 * 50 - 17.579095
y
# 문 속도가 70일때 제동거리는?
y <- 3.932402 * 70 - 17.579095
y

# 오차 꼭 있다. 인정하기
# 예상제동거리, 실제 제동거리, 오차 구하기
head(cars)
speed <- cars[, 1]
speed
b<- coef(mod1)[1]
W <- coef(mod1)[2]
pred <-  W*speed + b # 예상제동거리( 회귀식에 의한 제동거리)
pred

# 예상제동거리, 실제 제동거리, 오차 구하기 를 데이터프레임으로 만들기
compare <- data.frame( pred, cars[,2], pred - cars[,2]    )
compare
colnames(compare) <- c('예상제동거리', '실제제동거리', '오차')
compare


# 1. Loblolly 데이터셋에서 age를 이용해 height를 예측하는 단순선형 회귀모델을 만드시오. 그리고 age가 10, 15, 20일 때 height를 예측하여 보시오.
head(Loblolly)
dim( Loblolly )
str( Loblolly )
# 종속변수는(y값)? height, 독립변수(X)는 ? age

#  1단계 회기식이 가능한지 산점도를 그려서 확인하기
plot( height~age, data=Loblolly,  col='blue')
# 산점도에 대한 결과 분석 : 선형관계가 분명하다

# 2단계 회기식을 구하기 y = Wx + b
model.2 <- lm( height~age, Loblolly)
model.2
# 결과 회귀식 y = 2.591 X age + ( -1.312 )
W <- coef(model.2)[2]
b <- coef(model.2)[1]

# 3단계 age가 10, 15, 20일때 height를 예측하기 
age <- 10
y.10 <-  W * age + b
y.10
age <- 15
y.15 <-  W * age + b
y.15
age <- 20
y.20 <-  W * age + b
y.20

# 2. airquality 데이터셋에서 Wind로 Temp를 예측하는 단순선형 회귀모델을 만드시오. 그리고 Wind가 10, 15, 20일 때, Temp를 예측하여 보시오.

head(airquality)
dim( airquality )
str( airquality )

# 종속변수는(y값)? Temp, 독립변수(X)는 ? Wind

#  1단계 회기식이 가능한지 산점도를 그려서 확인하기
plot( Temp~Wind, data=airquality,  col='blue')
# 산점도에 대한 결과 분석 : 선형관계가 분명하다. 
# 바람이 많이 불수록 온도 내려간다. 

# 2단계 회기식을 구하기 y = Wx + b
model.3 <- lm( Temp~Wind, airquality)
model.3
# 결과 회귀식 y = -1.23 X Wind + ( 90.13  )
W <- coef(model.3)[2]
b <- coef(model.3)[1]

# 3단계 Wind가 10, 15, 20일 때, Temp를 예측 
Wind <- 10
y.10 <-  W * Wind + b
y.10 # 답 77.83008
Wind <- 15
y.15 <-  W * Wind + b
y.15 # 답 71.67768 
Wind <- 20
y.20 <-  W * Wind + b
y.20 # 답 65.52529 

# 3. pressure 데이터셋에서 온도(temperature)로 기압(pressure)을 예측하는 단순선형 회귀모델을 만드시오. 그리고 온도가 65, 95, 155일 때 기압을 예측하여 보시오.

head(pressure)
dim( pressure )
str( pressure )

# 종속변수는(y값)? pressure, 독립변수(X)는 ? temperature

#  1단계 회기식이 가능한지 산점도를 그려서 확인하기
plot( pressure~temperature, data=pressure,  col='blue')
# 산점도에 대한 결과 분석 : 선형관계가 분명하다. 
# 200도까지는 동일한데 200도이상부터 급격하게 기압상승한다. 비례

# 2단계 회기식을 구하기 y = Wx + b
model.4 <- lm( pressure~temperature, pressure)




model.4
# 결과 회귀식 y = 1.512 X temperature + ( -147.899   )
abline( model.4 ) # 1차방정식인 회귀식으로 직선 그리기 
W <- coef(model.4)[2]
b <- coef(model.4)[1]

# 3단계 온도가 65, 95, 155일 때 기압을 예측
temperature <- 65
y.10 <-  W * temperature + b
y.10 # 답  -49.59158
temperature <- 95
y.15 <-  W * temperature + b
y.15 # 답 -4.218984 
temperature <- 155
y.20 <-  W * temperature + b
y.20 # 답  86.52621  
temperature <- 350
y.30 <-  W * temperature + b
y.30 # 답  381.4481
