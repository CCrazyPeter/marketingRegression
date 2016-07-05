IIN Marketing Automation Test Suite
==========================================

Description:
------------

Project is a maven project which means that it must follow maven directory structure.
The project is flexible and while being developed should take into consideration the fact that it
will be used to drive all automation tests for the IIN Marketing Project. The project
will include the following platforms:
		- Web

Parameter:
----------

In order to achieve execution of test on several platforms, we introduced parameters that must be passed in order for tests to execute.
Below are the parameters you must provide:

		* -DbrowserName (ex. -DbrowserName=iOS )
		* -DbrowserVersion (ex. -DbrowserVersion=7.1)
		* -DbrowserPlatform (ex. -DbrowserPlatform=Mac)
		* -DbrowserType (ex. -DbrowserType=desktop)
		* -DtestURL (ex. -DtestURL="http://0.0.0.0:4723/wd/hub")
		* -DtestEnvironment (ex. -DtestEnvironment=live)
		* -Dgroups (ex. -Dgroups=beforeMerge,critical) [NOTE: You must pass it either ios, android, web, crossplatform in groups in order to ensure that test only for those devices get executed.]
		* -DforkMode (ex. -DforkMode=never) [NOTE: This is only needed if you are attempting to hook up an ide to mvn goal execution]

Example:
--------

web:

-- Remote:
- mvnDebug clean test  -DbrowserName={chrome/firefox/ie} -DbrowserPlatform=Mac -DtestURL="http://localhost:4444/wd/hub" -DtestEnvironment={stage,live,test} -DbrowserType={desktop,tablet,mobile} -DforkMode=never -Dgroups=web.critical

- mvn clean test  -DbrowserName={chrome/firefox/ie} -DbrowserPlatform=Mac -DtestURL="http://localhost:4444/wd/hub" -DtestEnvironment={stage,live,test} -DbrowserType={desktop,tablet,mobile} -Dgroups=web.critical

-- Local:
- mvnDebug clean test  -DbrowserName={chrome/firefox/ie} -DtestEnvironment={stage,live,test} -DbrowserType={desktop,tablet,mobile} -DforkMode=never -Dgroups=web.critical

- mvn clean test  -DbrowserName={chrome/firefox/ie} -DtestEnvironment={stage,live,test} -DbrowserType={desktop,tablet,mobile} -Dgroups=web.critical


Future Features:
----------------

- Provide ability to record test as they are being executed
- Enable email notification at certain milestones with test results, screen-shots and videos (if available).