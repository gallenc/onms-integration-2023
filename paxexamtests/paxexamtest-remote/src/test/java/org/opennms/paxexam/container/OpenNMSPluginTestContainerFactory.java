package org.opennms.paxexam.container;

import org.ops4j.pax.exam.ExamSystem;
import org.ops4j.pax.exam.RelativeTimeout;
import org.ops4j.pax.exam.TestContainer;
import org.ops4j.pax.exam.TestContainerFactory;
import org.ops4j.pax.exam.container.remote.RBCRemoteTargetOptions;
import org.ops4j.pax.exam.container.remote.RBCRemoteContainer;
import org.ops4j.pax.exam.container.remote.RBCRemoteTarget;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class OpenNMSPluginTestContainerFactory implements TestContainerFactory {

	/**
	 * System property key for RMI registry port.
	 */
	public static final String RMI_PORT_KEY = "pax.swissbox.framework.rmi.port";

	/**
	 * System property key for the name to be used for the remote framework in the
	 * RMI registry.
	 */
	public static final String RMI_NAME_KEY = "pax.swissbox.framework.rmi.name";

	/**
	 * System property key for the framework shutdown timeout (milliseconds in
	 * decimal representation).
	 */
	public static final String TIMEOUT_KEY = "pax.swissbox.framework.timeout";

	@Override
	public TestContainer[] create(final ExamSystem system) {

		List<TestContainer> containers = new ArrayList();

		System.setProperty("java.rmi.server.hostname", "localhost");

		String name = "karaf-root"; // karaf-root
		Integer registry = 55555; // is actually the port
		// Integer registry =44444; // is actually the port
		RelativeTimeout timeout = new RelativeTimeout(10000);

		TestContainer container = new RBCRemoteTarget(name, registry, timeout);

		containers.add(container);

		return containers.toArray(new TestContainer[containers.size()]);
	}

}
