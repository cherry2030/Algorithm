-- 코드를 입력하세요
-- 조회수가 가장 높은 중고거래 게시물에 대한 첨부파일 경로를 조회
-- 첨부파일 경로는 FILE ID를 기준으로 내림차순 정렬
-- 기본적인 파일경로는 /home/grep/src/
-- 게시글 ID를 기준으로 디렉토리가 구분되고, 파일이름은 파일 ID, 파일 이름, 파일 확장자로 구성되도록 출력

-- 1. 조회수가 가장 높은 게시글 -> 중첩 select 
-- 2. /home/grep/src/ + F.BOARD_ID + / + FILE_ID+FILE_NAME+FILE_EXT

SELECT concat('/home/grep/src/', F.BOARD_ID, '/', FILE_ID, FILE_NAME, FILE_EXT) as FILE_PATH
from USED_GOODS_FILE F
join USED_GOODS_BOARD B
on F.BOARD_ID = B.BOARD_ID
where F.BOARD_ID = (select BOARD_ID 
                    from USED_GOODS_BOARD 
                    order by VIEWS desc 
                    limit 1)
order by FILE_ID desc