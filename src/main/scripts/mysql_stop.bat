@echo off
cd /D %~dp0
echo MySQL shutdown...
taskkill /F /IM mysqld.exe

if not exist mysql\data\%computername%.pid GOTO exit
echo Deleting %computername%.pid ...
del mysql\data\%computername%.pid

:exit