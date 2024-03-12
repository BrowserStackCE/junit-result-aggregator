package com.browserstack.TransformerUtils;

import com.browserstack.jest.Entities.JestJson;
import com.browserstack.jest.Entities.TestResult;
import com.browserstack.jest.Entities.TestResult__1;
import com.browserstack.junit.Entities.*;
import org.mapstruct.Mapper;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@Mapper(componentModel = "spring")
public abstract class JsontoJunitMapper {

    public Testsuites jsontoJunit(JestJson jestReport) {
        Testsuites suites = new Testsuites();
        List<Testsuite> junitSuites = new ArrayList<>();
        for (TestResult item : jestReport.getTestResults()
        ) {
            junitSuites.add(jestSuiteToJunitSuite(item));
        }
        suites.setTestsuite(junitSuites);
        suites.setName("Jest Tests");
        suites.setTime(String.valueOf((jestReport.getEndTime() - jestReport.getStartTime()) / 1000));
        suites.setTests(String.valueOf(jestReport.getNumTotalTests().intValue()));
        suites.setFailures(String.valueOf(jestReport.getNumFailedTests().intValue()));
        suites.setErrors(String.valueOf(jestReport.getNumRuntimeErrorTestSuites().intValue()));
        return suites;
    }

    public Testsuite jestSuiteToJunitSuite(TestResult jestSuite) {

        Testsuite suite = new Testsuite();
        if (jestSuite != null && jestSuite.getTestResults().size() >= 1) {
            suite.setName(jestSuite.getTestResults().get(0).getAncestorTitles().get(0));
            suite.setTests(String.valueOf(jestSuite.getTestResults().size()));
        }

        List<Testcase> testCases = new ArrayList<>();
        for (TestResult__1 item : jestSuite.getTestResults()
        ) {
            testCases.add(jestTestCasetoJunit(item));
        }
        suite.setTestcase(testCases);
        suite.setTime(String.valueOf((jestSuite.getPerfStats().getEnd() - jestSuite.getPerfStats().getStart()) / 1000));
        suite.setSkipped(String.valueOf(jestSuite.getNumPendingTests().intValue()));
        suite.setFailures(String.valueOf(jestSuite.getNumFailingTests().intValue()));
        suite.setErrors("0");
        ZoneId zone = ZoneId.of("GMT");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-'T'HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone(zone));
        suite.setTimestamp(sdf.format(new Date(Double.valueOf(jestSuite.getPerfStats().getStart()).longValue())));
        //suite.setTimestamp(sdf.format(new Date(Double.valueOf(System.currentTimeMillis()).longValue())));
        return suite;
    }

    public Testcase jestTestCasetoJunit(TestResult__1 jestCase) {
        Testcase testCase = new Testcase();
        testCase.setName(jestCase.getFullName());
        //testCase.setClassname(jestCase.getFullName());
        testCase.setClassname(jestCase.getFullName());

        testCase.setFailure(jestFailurestoJunit(jestCase));
        if (jestCase.getDuration() != null) {
            testCase.setTime(String.valueOf(jestCase.getDuration() / 1000));
        } else {
            testCase.setTime("0.0");
        }
        if (jestCase.getStatus().equalsIgnoreCase("pending")) {
            testCase.setSkipped(new Skipped());
        } else if (jestCase.getStatus().equalsIgnoreCase("passed")) {

        } else {
            testCase.setStatus(jestCase.getStatus());
        }
        return testCase;
    }

    public List<Failure> jestFailurestoJunit(TestResult__1 jestFailureMessages) {
        List<Failure> failures = new ArrayList<>();
        if (jestFailureMessages != null && jestFailureMessages.getFailureMessages().size() >= 1) {

            for (Object item : jestFailureMessages.getFailureDetails()
            ) {
                Failure failure = new Failure();
                failure.setMessage(String.valueOf(jestFailureMessages.getFailureMessages().get(0)));
                failure.setContent(String.valueOf(item));
                failures.add(failure);
            }
        }
        return failures;
    }


}
