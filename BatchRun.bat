set projectLocation=C:\Users\RajendraKumarBelandu\eclipse-workspace\SugerCRMStg
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause