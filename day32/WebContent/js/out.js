function 로그인() {
	id2 = 'root';
	id = prompt('아이디 입력')
	if (id == id2) {// ==
		alert('로그인성공')
	} else {
		alert('로그인실패')
	}
}
function 비교() {
	n1 = 100
	n2 = 200
	// 두 숫자가 동일한지/동일하지 않은지 판별하여 프린트
	if (n1 == n2) {
		alert('동일')
	} else {
		alert('다름')
	}
}
// 친구의 기분(굿,별로,나빠) 입력
// 나의 기분(굿,별로,나빠) 입력
// 동일한지 판별
f1 = prompt('친구 기분')
f2 = prompt('내 기분')
if (f1 == f2) {
	alert('동일')
} else {
	alert('다름')

}
