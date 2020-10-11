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
echo  Expected: the - 2 quick - 1 brown - 1 fox - 1 jumps - 1
echo  Result of running:
java -jar TaskKotlin.jar the the quick brown fox jumps

:: TEST 2

echo.
echo  ---------------------------------------------------------
echo  Test 2. Data is received via a standard stream.
echo  ---------------------------------------------------------
echo  Data passed in the program: the the quick brown fox jumps
echo  Expected: the - 2 quick - 1 brown - 1 fox - 1 jumps - 1
echo  Result of running:
echo the the quick brown fox jumps| java -jar TaskKotlin.jar

:: TEST 3

echo.
echo  ---------------------------------------------------------
echo  Test 3. The same words are passed to the program
echo  ---------------------------------------------------------
echo  Data passed in the program: the the the the the the
echo  Expected: the - 6
echo  Result of running:
java -jar TaskKotlin.jar the the the the the the


:: TEST 4

echo.
echo  ---------------------------------------------------------
echo  Test 4. Passing a single word to the program
echo  ---------------------------------------------------------
echo  Data passed in the program: the
echo  Expected: the - 1
echo  Result of running:
java -jar TaskKotlin.jar the
echo.

pause