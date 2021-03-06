// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface CreateClusterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.CreateClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the parent field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getProjectId();
  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the parent field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * This field has been deprecated and replaced by the parent field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getZone();
  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * This field has been deprecated and replaced by the parent field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * A [cluster
   * resource](/container-engine/reference/rest/v1/projects.zones.clusters)
   * </pre>
   *
   * <code>.google.container.v1.Cluster cluster = 3;</code>
   */
  boolean hasCluster();
  /**
   * <pre>
   * A [cluster
   * resource](/container-engine/reference/rest/v1/projects.zones.clusters)
   * </pre>
   *
   * <code>.google.container.v1.Cluster cluster = 3;</code>
   */
  com.google.container.v1.Cluster getCluster();
  /**
   * <pre>
   * A [cluster
   * resource](/container-engine/reference/rest/v1/projects.zones.clusters)
   * </pre>
   *
   * <code>.google.container.v1.Cluster cluster = 3;</code>
   */
  com.google.container.v1.ClusterOrBuilder getClusterOrBuilder();

  /**
   * <pre>
   * The parent (project and location) where the cluster will be created.
   * Specified in the format 'projects/&#42;&#47;locations/&#42;'.
   * </pre>
   *
   * <code>string parent = 5;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The parent (project and location) where the cluster will be created.
   * Specified in the format 'projects/&#42;&#47;locations/&#42;'.
   * </pre>
   *
   * <code>string parent = 5;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();
}
