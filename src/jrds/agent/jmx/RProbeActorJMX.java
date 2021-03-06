package jrds.agent.jmx;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

import jrds.agent.RProbeActor;

public class RProbeActorJMX extends RProbeActor {
    final private long starttime;
    
    public RProbeActorJMX() {
       RuntimeMXBean rtbean = ManagementFactory.getRuntimeMXBean();

        starttime = rtbean.getStartTime();
    }
 
    @Override
    public long getUptime() {
        return System.currentTimeMillis() - starttime;
    }

}
