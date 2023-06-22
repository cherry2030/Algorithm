-- 코드를 입력하세요
-- 2022년 10월에 작성한 
-- 댓글 작성일을 기준으로 오름차순 정렬해주시고, 댓글 작성일이 같다면 게시글 제목을 기준으로 오름차순 정렬
SELECT board.TITLE, 
    board.BOARD_ID, 
    reply.REPLY_ID, 
    reply.WRITER_ID, 
    reply.CONTENTS, 
    DATE_FORMAT(reply.CREATED_DATE, '%Y-%m-%d') as CREATED_DATE
FROM USED_GOODS_REPLY AS REPLY
LEFT JOIN USED_GOODS_BOARD AS BOARD
on board.BOARD_ID = reply.BOARD_ID
where DATE_FORMAT(BOARD.CREATED_DATE, '%Y-%m') = '2022-10'
order by reply.CREATED_DATE, board.TITLE;