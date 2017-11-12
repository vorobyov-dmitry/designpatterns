package patterns.structural.marker;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.jupiter.api.Assertions.fail;

public class TestMarker {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestMarker.class);

	@Test
	public void testMarker() {
		Annotation[] annotations = null;
		try {
			Class<Marker> markerClass = Marker.class;
			Method method = markerClass.getMethod("setI", new Class[] { int.class });
			annotations = method.getAnnotations();
		} catch (Exception e) {
			LOGGER.error("Error  ", e);
		}
		if (annotations == null || annotations.length == 0) {
			fail(" There not such annotaion in class");
		}

	}
}
