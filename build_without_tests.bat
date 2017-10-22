echo on
call mvn.cmd   package -Dmaven.test.skip=true  -X >mvn_package_without_tests_log.txt
