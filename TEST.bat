setlocal enabledelayedexpansion
@echo off

echo  -------------------------
echo  Running console app tests
echo  -------------------------

:: TEST 1

echo.
echo  --------------------------------------------------------
echo  Test 1. Data is passed to the program.
echo  --------------------------------------------------------
echo  Data passed in the program: the the quick brown fox jumps
echo  Expected: the - 2 brown - 1 fox - 1 jumps - 1 quick - 1
echo  Result of running:
java -jar TaskKotlin.jar the the quick brown fox jumps

:: TEST 2

echo.
echo  ---------------------------------------------------------
echo  Test 2. Data is received via a standard stream.
echo  ---------------------------------------------------------
echo  Data passed in the program: the the quick brown fox jumps
echo  Expected: the - 2 brown - 1 fox - 1 jumps - 1 quick - 1
echo  Result of running:
echo the the quick brown fox jumps| java -jar TaskKotlin.jar

:: TEST 3

echo.
echo  ---------------------------------------------------------
echo  Test 3. The same words are passed to the program
echo  ---------------------------------------------------------
echo  Data passed in the program: the the the the the the the the the the the the the the the the the the the the
echo  Expected: the - 20
echo  Result of running:
java -jar TaskKotlin.jar the the the the the the the the the the the the the the the the the the the the


:: TEST 4

echo.
echo  ---------------------------------------------------------
echo  Test 4. Special characters are passed to the program
echo  ---------------------------------------------------------
echo  Data passed in the program: ★★★
echo  Expected: ★★★ - 1
echo  Result of running:
java -jar TaskKotlin.jar ★★★
echo.


:: TEST 5

echo.
echo  ---------------------------------------------------------
echo  Test 5. An empty string was passed to the program
echo  ---------------------------------------------------------
echo  Data passed in the program:
echo  Expected: Waiting for a line to be entered
echo  Result of running:
java -jar TaskKotlin.jar

:: TEST 6

echo.
echo  ---------------------------------------------------------
echo  Test 6. Several spaces were passed to the program
echo  ---------------------------------------------------------
echo  Data passed in the program:       
echo  Expected: (ECHO) - 1  - 1 Є ¤ - 1 нЄа  - 1  Ё - 1 ўЄоз. - 1 ўлў¤  - 1
echo  Result of running:
echo       | java -jar TaskKotlin.jar

:: TEST 7

echo.
echo  ---------------------------------------------------------
echo  Test 7. The program is passed a string with several spaces between words
echo  ---------------------------------------------------------
echo  Data passed in the program: the        the   
echo  Expected:  - 7 the - 2
echo  Result of running:
echo the        the| java -jar TaskKotlin.jar 
pause
