@echo off
REM Simple Calculator - Batch Runner for Windows

echo Compiling Calculator.java...
javac Calculator.java

if errorlevel 1 (
    echo Compilation failed!
    pause
    exit /b 1
)

echo Compilation successful!
echo.
echo Running Calculator...
echo.

java Calculator

pause
