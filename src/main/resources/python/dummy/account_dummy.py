# from faker import Faker
# from sqlalchemy import create_engine
# import sqlalchemy as db
# import random
# import pandas as pd
#
#
# fake = Faker('ko_KR') # locale 정보 설정
# Faker.seed() # 초기 seed 설정
#
# # ======= Reference =======
# # https://velog.io/@seanlee/이커머스-더미데이터-생성
# # https://www.daleseo.com/python-faker/
#
# # name : 이름 (문자)
# # phone : 휴대전화 (문자, 010-****-**** 형식)
# # user_status : 유저상태 (문자, ['active', 'inactive', 'dormancy'])
# # user_class : 유저등급 (문자, ['일반','Family', 'VIP', 'VVIP'])
# # email : 이메일 주소 (문자)
# # marketing_agree : 마케팅 수신동의 (참거짓)
# # social_login : 소셜 로그인 (문자, ['google','facebook','kakao','naver'])
# # last_logged_at : 마지막 접속일 (날짜)
# # created_at : 생성일 및 가입일 (날짜)
# # address: 주소
#
# # dummy data count
# repeat_count = 100
#
# name = [fake.name() for i in range(repeat_count)]
# address = [fake.unique.address() for i in range(repeat_count)] # unique 추가시 고유값 생성
# contact = [
#     ('010-'+str(random.randint(1, 9999)).zfill(4) + '-' + str(random.randint(1, 9999)).zfill(4))
#     for i in range(repeat_count)
# ]
#
# df = pd.DataFrame()
# df['name'] = name
# df['address'] = address
# df['contact'] = contact
#
# # print(df)
#
# # pandas to dict == to json
# # ex) {"name": "name", ...}
# records = df.to_dict(orient='records')
# # print(records)
#
# # <...> 부분은 본인 DB 정보
# engine = create_engine("mysql+mysqldb://root:1207@localhost:3306/recur?charset=utf8mb4")
#
# with engine.connect() as conn:
#     metadata = db.MetaData()
# # <table>에는 데이터 형식에 맞게 테이블이 생성되어 있어야 됨 (본인 테이블명 기입)
#     table = db.Table('account', metadata, autoload=True, autoload_with=engine)
#
#     query = db.insert(table).values(records)
#     result_proxy = conn.execute(query)