package patterns.structural.facade;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.OutputStreamAppender;
import patterns.structural.decorator.TestDecorator;

public class TestFacade {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestDecorator.class);

	/**
	 * Implemeneted via loggers , but the singleton register of action could be used
	 * instead of loggers
	 */
	@Test
	public void testFacade() {
		PatternLayoutEncoder logEncoder = new PatternLayoutEncoder();
		OutputStreamAppender<ILoggingEvent> outputStreamAppender = new OutputStreamAppender<ILoggingEvent>();
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		// we use Logback , so it is safe
		try {
			LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
			logEncoder.setContext(loggerContext);
			logEncoder.setPattern("%-5level - %msg%n");
			logEncoder.start();
			outputStreamAppender.setOutputStream(outputStream);
			outputStreamAppender.setEncoder(logEncoder);
			outputStreamAppender.start();
			ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory
					.getLogger("patterns.structural.facade");
			logger.addAppender(outputStreamAppender);
			doActionByFacade();
			outputStream.flush();
			String sFacade = outputStream.toString();
			outputStream.reset();
			doActionWithoutFacade();
			outputStream.flush();
			String sWithoutFacade = outputStream.toString();
			assertEquals(sFacade, sWithoutFacade, "The values should be equals ");
		} catch (Exception e) {
			LOGGER.error(" Error closing stream ", e);
			fail("Failed due Exception " + e.getMessage());
		} finally {
			outputStreamAppender.stop();
			logEncoder.stop();
			try {
				outputStream.close();
			} catch (IOException e) {
				LOGGER.error(" Error closing stream ", e);
			}
		}
	}

	private void doActionWithoutFacade() {
		Class1 class1 = new Class1();
		Class2 class2 = new Class2();
		Class3 class3 = new Class3();
		class1.setClass2(class2);
		class3.setClass1(class1);
		class2.doSomething2();
		class2.doSomethingElse();
		class1.doSomething1();
		class2.doSomething2();
		class3.doSomething3();
		class1.doSomething1();
		class3.doSomething3();

	}

	public void doActionByFacade() {
		Facade facade = new FacadeImpl();
		facade.doCool();
	}

}
