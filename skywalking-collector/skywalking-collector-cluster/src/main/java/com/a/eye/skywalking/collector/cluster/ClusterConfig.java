package com.a.eye.skywalking.collector.cluster;

/**
 * A static class contains some config values of cluster.
 * {@link Cluster.Current#hostname} is a ip address of server which start this process.
 * {@link Cluster.Current#port} is a port of server use to bind
 * {@link Cluster.Current#roles} is a roles of workers that use to create workers which
 * has those role in this process.
 * {@link Cluster#seed_nodes} is a seed_nodes which cluster have.
 *
 * @author pengys5
 */
public class ClusterConfig {

    public static class Cluster {
        public static class Current {
            public static String hostname = "127.0.0.1";
            public static String port = "2551";
            public static String roles = "";
        }

        public static String seed_nodes = "127.0.0.1:2551";
    }
}
