package jobs.samzajobs;

import org.apache.samza.config.Config;
import org.apache.samza.system.IncomingMessageEnvelope;
import org.apache.samza.task.InitableTask;
import org.apache.samza.task.MessageCollector;
import org.apache.samza.task.StreamTask;
import org.apache.samza.task.TaskContext;
import org.apache.samza.task.TaskCoordinator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestJob implements StreamTask,InitableTask{
    private static final Logger logger = LoggerFactory.getLogger(TestJob.class);
    
    public void process(IncomingMessageEnvelope envelope, MessageCollector collector, TaskCoordinator coordinator)
            throws Exception {
       logger.debug("inside process....");
    }

    public void init(Config config, TaskContext context) throws Exception {
        logger.debug("initializing task..");
    }

}
