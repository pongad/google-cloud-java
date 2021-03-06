// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface NodeConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.NodeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of a Google Compute Engine [machine
   * type](/compute/docs/machine-types) (e.g.
   * `n1-standard-1`).
   * If unspecified, the default machine type is
   * `n1-standard-1`.
   * </pre>
   *
   * <code>string machine_type = 1;</code>
   */
  java.lang.String getMachineType();
  /**
   * <pre>
   * The name of a Google Compute Engine [machine
   * type](/compute/docs/machine-types) (e.g.
   * `n1-standard-1`).
   * If unspecified, the default machine type is
   * `n1-standard-1`.
   * </pre>
   *
   * <code>string machine_type = 1;</code>
   */
  com.google.protobuf.ByteString
      getMachineTypeBytes();

  /**
   * <pre>
   * Size of the disk attached to each node, specified in GB.
   * The smallest allowed disk size is 10GB.
   * If unspecified, the default disk size is 100GB.
   * </pre>
   *
   * <code>int32 disk_size_gb = 2;</code>
   */
  int getDiskSizeGb();

  /**
   * <pre>
   * The set of Google API scopes to be made available on all of the
   * node VMs under the "default" service account.
   * The following scopes are recommended, but not required, and by default are
   * not included:
   * * `https://www.googleapis.com/auth/compute` is required for mounting
   * persistent storage on your nodes.
   * * `https://www.googleapis.com/auth/devstorage.read_only` is required for
   * communicating with **gcr.io**
   * (the [Google Container Registry](/container-registry/)).
   * If unspecified, no scopes are added, unless Cloud Logging or Cloud
   * Monitoring are enabled, in which case their required scopes will be added.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 3;</code>
   */
  java.util.List<java.lang.String>
      getOauthScopesList();
  /**
   * <pre>
   * The set of Google API scopes to be made available on all of the
   * node VMs under the "default" service account.
   * The following scopes are recommended, but not required, and by default are
   * not included:
   * * `https://www.googleapis.com/auth/compute` is required for mounting
   * persistent storage on your nodes.
   * * `https://www.googleapis.com/auth/devstorage.read_only` is required for
   * communicating with **gcr.io**
   * (the [Google Container Registry](/container-registry/)).
   * If unspecified, no scopes are added, unless Cloud Logging or Cloud
   * Monitoring are enabled, in which case their required scopes will be added.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 3;</code>
   */
  int getOauthScopesCount();
  /**
   * <pre>
   * The set of Google API scopes to be made available on all of the
   * node VMs under the "default" service account.
   * The following scopes are recommended, but not required, and by default are
   * not included:
   * * `https://www.googleapis.com/auth/compute` is required for mounting
   * persistent storage on your nodes.
   * * `https://www.googleapis.com/auth/devstorage.read_only` is required for
   * communicating with **gcr.io**
   * (the [Google Container Registry](/container-registry/)).
   * If unspecified, no scopes are added, unless Cloud Logging or Cloud
   * Monitoring are enabled, in which case their required scopes will be added.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 3;</code>
   */
  java.lang.String getOauthScopes(int index);
  /**
   * <pre>
   * The set of Google API scopes to be made available on all of the
   * node VMs under the "default" service account.
   * The following scopes are recommended, but not required, and by default are
   * not included:
   * * `https://www.googleapis.com/auth/compute` is required for mounting
   * persistent storage on your nodes.
   * * `https://www.googleapis.com/auth/devstorage.read_only` is required for
   * communicating with **gcr.io**
   * (the [Google Container Registry](/container-registry/)).
   * If unspecified, no scopes are added, unless Cloud Logging or Cloud
   * Monitoring are enabled, in which case their required scopes will be added.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 3;</code>
   */
  com.google.protobuf.ByteString
      getOauthScopesBytes(int index);

  /**
   * <pre>
   * The Google Cloud Platform Service Account to be used by the node VMs. If
   * no Service Account is specified, the "default" service account is used.
   * </pre>
   *
   * <code>string service_account = 9;</code>
   */
  java.lang.String getServiceAccount();
  /**
   * <pre>
   * The Google Cloud Platform Service Account to be used by the node VMs. If
   * no Service Account is specified, the "default" service account is used.
   * </pre>
   *
   * <code>string service_account = 9;</code>
   */
  com.google.protobuf.ByteString
      getServiceAccountBytes();

  /**
   * <pre>
   * The metadata key/value pairs assigned to instances in the cluster.
   * Keys must conform to the regexp [a-zA-Z0-9-_]+ and be less than 128 bytes
   * in length. These are reflected as part of a URL in the metadata server.
   * Additionally, to avoid ambiguity, keys must not conflict with any other
   * metadata keys for the project or be one of the reserved keys:
   *  "cluster-location"
   *  "cluster-name"
   *  "cluster-uid"
   *  "configure-sh"
   *  "enable-os-login"
   *  "gci-update-strategy"
   *  "gci-ensure-gke-docker"
   *  "instance-template"
   *  "kube-env"
   *  "startup-script"
   *  "user-data"
   * Values are free-form strings, and only have meaning as interpreted by
   * the image running in the instance. The only restriction placed on them is
   * that each value's size must be less than or equal to 32 KB.
   * The total size of all keys and values must be less than 512 KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 4;</code>
   */
  int getMetadataCount();
  /**
   * <pre>
   * The metadata key/value pairs assigned to instances in the cluster.
   * Keys must conform to the regexp [a-zA-Z0-9-_]+ and be less than 128 bytes
   * in length. These are reflected as part of a URL in the metadata server.
   * Additionally, to avoid ambiguity, keys must not conflict with any other
   * metadata keys for the project or be one of the reserved keys:
   *  "cluster-location"
   *  "cluster-name"
   *  "cluster-uid"
   *  "configure-sh"
   *  "enable-os-login"
   *  "gci-update-strategy"
   *  "gci-ensure-gke-docker"
   *  "instance-template"
   *  "kube-env"
   *  "startup-script"
   *  "user-data"
   * Values are free-form strings, and only have meaning as interpreted by
   * the image running in the instance. The only restriction placed on them is
   * that each value's size must be less than or equal to 32 KB.
   * The total size of all keys and values must be less than 512 KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 4;</code>
   */
  boolean containsMetadata(
      java.lang.String key);
  /**
   * Use {@link #getMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMetadata();
  /**
   * <pre>
   * The metadata key/value pairs assigned to instances in the cluster.
   * Keys must conform to the regexp [a-zA-Z0-9-_]+ and be less than 128 bytes
   * in length. These are reflected as part of a URL in the metadata server.
   * Additionally, to avoid ambiguity, keys must not conflict with any other
   * metadata keys for the project or be one of the reserved keys:
   *  "cluster-location"
   *  "cluster-name"
   *  "cluster-uid"
   *  "configure-sh"
   *  "enable-os-login"
   *  "gci-update-strategy"
   *  "gci-ensure-gke-docker"
   *  "instance-template"
   *  "kube-env"
   *  "startup-script"
   *  "user-data"
   * Values are free-form strings, and only have meaning as interpreted by
   * the image running in the instance. The only restriction placed on them is
   * that each value's size must be less than or equal to 32 KB.
   * The total size of all keys and values must be less than 512 KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMetadataMap();
  /**
   * <pre>
   * The metadata key/value pairs assigned to instances in the cluster.
   * Keys must conform to the regexp [a-zA-Z0-9-_]+ and be less than 128 bytes
   * in length. These are reflected as part of a URL in the metadata server.
   * Additionally, to avoid ambiguity, keys must not conflict with any other
   * metadata keys for the project or be one of the reserved keys:
   *  "cluster-location"
   *  "cluster-name"
   *  "cluster-uid"
   *  "configure-sh"
   *  "enable-os-login"
   *  "gci-update-strategy"
   *  "gci-ensure-gke-docker"
   *  "instance-template"
   *  "kube-env"
   *  "startup-script"
   *  "user-data"
   * Values are free-form strings, and only have meaning as interpreted by
   * the image running in the instance. The only restriction placed on them is
   * that each value's size must be less than or equal to 32 KB.
   * The total size of all keys and values must be less than 512 KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 4;</code>
   */

  java.lang.String getMetadataOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * The metadata key/value pairs assigned to instances in the cluster.
   * Keys must conform to the regexp [a-zA-Z0-9-_]+ and be less than 128 bytes
   * in length. These are reflected as part of a URL in the metadata server.
   * Additionally, to avoid ambiguity, keys must not conflict with any other
   * metadata keys for the project or be one of the reserved keys:
   *  "cluster-location"
   *  "cluster-name"
   *  "cluster-uid"
   *  "configure-sh"
   *  "enable-os-login"
   *  "gci-update-strategy"
   *  "gci-ensure-gke-docker"
   *  "instance-template"
   *  "kube-env"
   *  "startup-script"
   *  "user-data"
   * Values are free-form strings, and only have meaning as interpreted by
   * the image running in the instance. The only restriction placed on them is
   * that each value's size must be less than or equal to 32 KB.
   * The total size of all keys and values must be less than 512 KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 4;</code>
   */

  java.lang.String getMetadataOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The image type to use for this node. Note that for a given image type,
   * the latest version of it will be used.
   * </pre>
   *
   * <code>string image_type = 5;</code>
   */
  java.lang.String getImageType();
  /**
   * <pre>
   * The image type to use for this node. Note that for a given image type,
   * the latest version of it will be used.
   * </pre>
   *
   * <code>string image_type = 5;</code>
   */
  com.google.protobuf.ByteString
      getImageTypeBytes();

  /**
   * <pre>
   * The map of Kubernetes labels (key/value pairs) to be applied to each node.
   * These will added in addition to any default label(s) that
   * Kubernetes may apply to the node.
   * In case of conflict in label keys, the applied set may differ depending on
   * the Kubernetes version -- it's best to assume the behavior is undefined
   * and conflicts should be avoided.
   * For more information, including usage and the valid values, see:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * The map of Kubernetes labels (key/value pairs) to be applied to each node.
   * These will added in addition to any default label(s) that
   * Kubernetes may apply to the node.
   * In case of conflict in label keys, the applied set may differ depending on
   * the Kubernetes version -- it's best to assume the behavior is undefined
   * and conflicts should be avoided.
   * For more information, including usage and the valid values, see:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * The map of Kubernetes labels (key/value pairs) to be applied to each node.
   * These will added in addition to any default label(s) that
   * Kubernetes may apply to the node.
   * In case of conflict in label keys, the applied set may differ depending on
   * the Kubernetes version -- it's best to assume the behavior is undefined
   * and conflicts should be avoided.
   * For more information, including usage and the valid values, see:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * The map of Kubernetes labels (key/value pairs) to be applied to each node.
   * These will added in addition to any default label(s) that
   * Kubernetes may apply to the node.
   * In case of conflict in label keys, the applied set may differ depending on
   * the Kubernetes version -- it's best to assume the behavior is undefined
   * and conflicts should be avoided.
   * For more information, including usage and the valid values, see:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */

  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * The map of Kubernetes labels (key/value pairs) to be applied to each node.
   * These will added in addition to any default label(s) that
   * Kubernetes may apply to the node.
   * In case of conflict in label keys, the applied set may differ depending on
   * the Kubernetes version -- it's best to assume the behavior is undefined
   * and conflicts should be avoided.
   * For more information, including usage and the valid values, see:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The number of local SSD disks to be attached to the node.
   * The limit for this value is dependant upon the maximum number of
   * disks available on a machine per zone. See:
   * https://cloud.google.com/compute/docs/disks/local-ssd#local_ssd_limits
   * for more information.
   * </pre>
   *
   * <code>int32 local_ssd_count = 7;</code>
   */
  int getLocalSsdCount();

  /**
   * <pre>
   * The list of instance tags applied to all nodes. Tags are used to identify
   * valid sources or targets for network firewalls and are specified by
   * the client during cluster or node pool creation. Each tag within the list
   * must comply with RFC1035.
   * </pre>
   *
   * <code>repeated string tags = 8;</code>
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <pre>
   * The list of instance tags applied to all nodes. Tags are used to identify
   * valid sources or targets for network firewalls and are specified by
   * the client during cluster or node pool creation. Each tag within the list
   * must comply with RFC1035.
   * </pre>
   *
   * <code>repeated string tags = 8;</code>
   */
  int getTagsCount();
  /**
   * <pre>
   * The list of instance tags applied to all nodes. Tags are used to identify
   * valid sources or targets for network firewalls and are specified by
   * the client during cluster or node pool creation. Each tag within the list
   * must comply with RFC1035.
   * </pre>
   *
   * <code>repeated string tags = 8;</code>
   */
  java.lang.String getTags(int index);
  /**
   * <pre>
   * The list of instance tags applied to all nodes. Tags are used to identify
   * valid sources or targets for network firewalls and are specified by
   * the client during cluster or node pool creation. Each tag within the list
   * must comply with RFC1035.
   * </pre>
   *
   * <code>repeated string tags = 8;</code>
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <pre>
   * Whether the nodes are created as preemptible VM instances. See:
   * https://cloud.google.com/compute/docs/instances/preemptible for more
   * information about preemptible VM instances.
   * </pre>
   *
   * <code>bool preemptible = 10;</code>
   */
  boolean getPreemptible();

  /**
   * <pre>
   * A list of hardware accelerators to be attached to each node.
   * See https://cloud.google.com/compute/docs/gpus for more information about
   * support for GPUs.
   * </pre>
   *
   * <code>repeated .google.container.v1.AcceleratorConfig accelerators = 11;</code>
   */
  java.util.List<com.google.container.v1.AcceleratorConfig> 
      getAcceleratorsList();
  /**
   * <pre>
   * A list of hardware accelerators to be attached to each node.
   * See https://cloud.google.com/compute/docs/gpus for more information about
   * support for GPUs.
   * </pre>
   *
   * <code>repeated .google.container.v1.AcceleratorConfig accelerators = 11;</code>
   */
  com.google.container.v1.AcceleratorConfig getAccelerators(int index);
  /**
   * <pre>
   * A list of hardware accelerators to be attached to each node.
   * See https://cloud.google.com/compute/docs/gpus for more information about
   * support for GPUs.
   * </pre>
   *
   * <code>repeated .google.container.v1.AcceleratorConfig accelerators = 11;</code>
   */
  int getAcceleratorsCount();
  /**
   * <pre>
   * A list of hardware accelerators to be attached to each node.
   * See https://cloud.google.com/compute/docs/gpus for more information about
   * support for GPUs.
   * </pre>
   *
   * <code>repeated .google.container.v1.AcceleratorConfig accelerators = 11;</code>
   */
  java.util.List<? extends com.google.container.v1.AcceleratorConfigOrBuilder> 
      getAcceleratorsOrBuilderList();
  /**
   * <pre>
   * A list of hardware accelerators to be attached to each node.
   * See https://cloud.google.com/compute/docs/gpus for more information about
   * support for GPUs.
   * </pre>
   *
   * <code>repeated .google.container.v1.AcceleratorConfig accelerators = 11;</code>
   */
  com.google.container.v1.AcceleratorConfigOrBuilder getAcceleratorsOrBuilder(
      int index);

  /**
   * <pre>
   * Type of the disk attached to each node (e.g. 'pd-standard' or 'pd-ssd')
   * If unspecified, the default disk type is 'pd-standard'
   * </pre>
   *
   * <code>string disk_type = 12;</code>
   */
  java.lang.String getDiskType();
  /**
   * <pre>
   * Type of the disk attached to each node (e.g. 'pd-standard' or 'pd-ssd')
   * If unspecified, the default disk type is 'pd-standard'
   * </pre>
   *
   * <code>string disk_type = 12;</code>
   */
  com.google.protobuf.ByteString
      getDiskTypeBytes();

  /**
   * <pre>
   * Minimum CPU platform to be used by this instance. The instance may be
   * scheduled on the specified or newer CPU platform. Applicable values are the
   * friendly names of CPU platforms, such as
   * &lt;code&gt;minCpuPlatform: &amp;quot;Intel Haswell&amp;quot;&lt;/code&gt; or
   * &lt;code&gt;minCpuPlatform: &amp;quot;Intel Sandy Bridge&amp;quot;&lt;/code&gt;. For more
   * information, read [how to specify min CPU
   * platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
   * </pre>
   *
   * <code>string min_cpu_platform = 13;</code>
   */
  java.lang.String getMinCpuPlatform();
  /**
   * <pre>
   * Minimum CPU platform to be used by this instance. The instance may be
   * scheduled on the specified or newer CPU platform. Applicable values are the
   * friendly names of CPU platforms, such as
   * &lt;code&gt;minCpuPlatform: &amp;quot;Intel Haswell&amp;quot;&lt;/code&gt; or
   * &lt;code&gt;minCpuPlatform: &amp;quot;Intel Sandy Bridge&amp;quot;&lt;/code&gt;. For more
   * information, read [how to specify min CPU
   * platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
   * </pre>
   *
   * <code>string min_cpu_platform = 13;</code>
   */
  com.google.protobuf.ByteString
      getMinCpuPlatformBytes();
}
