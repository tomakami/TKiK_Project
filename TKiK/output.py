# Please ensure that this library is available in Python 3.0: import iostream
# Please ensure that this library is available in Python 3.0: import vector

def main(s):
	for i in range(0, 10):
		i += 1

	test = 1
	flag = False
	str = "asdasd"
	tablica = [1, 2, 3, 4]
	if flag and test:
		test = 2

	elif test == True:
		test = 3

	else:
		test = 4

	if 1 > 0 or test == 2:
		test = 3 - 2

	while test:
		while test > 0:
			test -= 1

		test += 1
		test += 1

	while flag == False:
		flag = not flag

	b = 2 + 3
	if b == 3:
		b += 1
		return b * 2

	result = 1 + 7
	z = 2 * 8
	a = 6 - 1
	x = 5 % a
	x += 1
	expresion = 1 and 1
	expression2 = 0 or False
	return 12 % b

def greater(i, j):
	if i >= j:
		return i

	else:
		return j


if __name__ == '__main__':
	main()