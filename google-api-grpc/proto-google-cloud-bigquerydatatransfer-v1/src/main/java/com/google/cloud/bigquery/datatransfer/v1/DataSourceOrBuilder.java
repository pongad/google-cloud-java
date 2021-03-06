// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

public interface DataSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.DataSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Data source resource name.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Data source resource name.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Data source id.
   * </pre>
   *
   * <code>string data_source_id = 2;</code>
   */
  java.lang.String getDataSourceId();
  /**
   * <pre>
   * Data source id.
   * </pre>
   *
   * <code>string data_source_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getDataSourceIdBytes();

  /**
   * <pre>
   * User friendly data source name.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * User friendly data source name.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * User friendly data source description string.
   * </pre>
   *
   * <code>string description = 4;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * User friendly data source description string.
   * </pre>
   *
   * <code>string description = 4;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Data source client id which should be used to receive refresh token.
   * When not supplied, no offline credentials are populated for data transfer.
   * </pre>
   *
   * <code>string client_id = 5;</code>
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * Data source client id which should be used to receive refresh token.
   * When not supplied, no offline credentials are populated for data transfer.
   * </pre>
   *
   * <code>string client_id = 5;</code>
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <pre>
   * Api auth scopes for which refresh token needs to be obtained. Only valid
   * when `client_id` is specified. Ignored otherwise. These are scopes needed
   * by a data source to prepare data and ingest them into BigQuery,
   * e.g., https://www.googleapis.com/auth/bigquery
   * </pre>
   *
   * <code>repeated string scopes = 6;</code>
   */
  java.util.List<java.lang.String>
      getScopesList();
  /**
   * <pre>
   * Api auth scopes for which refresh token needs to be obtained. Only valid
   * when `client_id` is specified. Ignored otherwise. These are scopes needed
   * by a data source to prepare data and ingest them into BigQuery,
   * e.g., https://www.googleapis.com/auth/bigquery
   * </pre>
   *
   * <code>repeated string scopes = 6;</code>
   */
  int getScopesCount();
  /**
   * <pre>
   * Api auth scopes for which refresh token needs to be obtained. Only valid
   * when `client_id` is specified. Ignored otherwise. These are scopes needed
   * by a data source to prepare data and ingest them into BigQuery,
   * e.g., https://www.googleapis.com/auth/bigquery
   * </pre>
   *
   * <code>repeated string scopes = 6;</code>
   */
  java.lang.String getScopes(int index);
  /**
   * <pre>
   * Api auth scopes for which refresh token needs to be obtained. Only valid
   * when `client_id` is specified. Ignored otherwise. These are scopes needed
   * by a data source to prepare data and ingest them into BigQuery,
   * e.g., https://www.googleapis.com/auth/bigquery
   * </pre>
   *
   * <code>repeated string scopes = 6;</code>
   */
  com.google.protobuf.ByteString
      getScopesBytes(int index);

  /**
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.TransferType transfer_type = 7;</code>
   */
  int getTransferTypeValue();
  /**
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.TransferType transfer_type = 7;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.TransferType getTransferType();

  /**
   * <pre>
   * Indicates whether the data source supports multiple transfers
   * to different BigQuery targets.
   * </pre>
   *
   * <code>bool supports_multiple_transfers = 8;</code>
   */
  boolean getSupportsMultipleTransfers();

  /**
   * <pre>
   * The number of seconds to wait for an update from the data source
   * before BigQuery marks the transfer as failed.
   * </pre>
   *
   * <code>int32 update_deadline_seconds = 9;</code>
   */
  int getUpdateDeadlineSeconds();

  /**
   * <pre>
   * Default data transfer schedule.
   * Examples of valid schedules include:
   * `1st,3rd monday of month 15:30`,
   * `every wed,fri of jan,jun 13:15`, and
   * `first sunday of quarter 00:00`.
   * </pre>
   *
   * <code>string default_schedule = 10;</code>
   */
  java.lang.String getDefaultSchedule();
  /**
   * <pre>
   * Default data transfer schedule.
   * Examples of valid schedules include:
   * `1st,3rd monday of month 15:30`,
   * `every wed,fri of jan,jun 13:15`, and
   * `first sunday of quarter 00:00`.
   * </pre>
   *
   * <code>string default_schedule = 10;</code>
   */
  com.google.protobuf.ByteString
      getDefaultScheduleBytes();

  /**
   * <pre>
   * Specifies whether the data source supports a user defined schedule, or
   * operates on the default schedule.
   * When set to `true`, user can override default schedule.
   * </pre>
   *
   * <code>bool supports_custom_schedule = 11;</code>
   */
  boolean getSupportsCustomSchedule();

  /**
   * <pre>
   * Data source parameters.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSourceParameter parameters = 12;</code>
   */
  java.util.List<com.google.cloud.bigquery.datatransfer.v1.DataSourceParameter> 
      getParametersList();
  /**
   * <pre>
   * Data source parameters.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSourceParameter parameters = 12;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.DataSourceParameter getParameters(int index);
  /**
   * <pre>
   * Data source parameters.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSourceParameter parameters = 12;</code>
   */
  int getParametersCount();
  /**
   * <pre>
   * Data source parameters.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSourceParameter parameters = 12;</code>
   */
  java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.DataSourceParameterOrBuilder> 
      getParametersOrBuilderList();
  /**
   * <pre>
   * Data source parameters.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSourceParameter parameters = 12;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.DataSourceParameterOrBuilder getParametersOrBuilder(
      int index);

  /**
   * <pre>
   * Url for the help document for this data source.
   * </pre>
   *
   * <code>string help_url = 13;</code>
   */
  java.lang.String getHelpUrl();
  /**
   * <pre>
   * Url for the help document for this data source.
   * </pre>
   *
   * <code>string help_url = 13;</code>
   */
  com.google.protobuf.ByteString
      getHelpUrlBytes();

  /**
   * <pre>
   * Indicates the type of authorization.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSource.AuthorizationType authorization_type = 14;</code>
   */
  int getAuthorizationTypeValue();
  /**
   * <pre>
   * Indicates the type of authorization.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSource.AuthorizationType authorization_type = 14;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.DataSource.AuthorizationType getAuthorizationType();

  /**
   * <pre>
   * Specifies whether the data source supports automatic data refresh for the
   * past few days, and how it's supported.
   * For some data sources, data might not be complete until a few days later,
   * so it's useful to refresh data automatically.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSource.DataRefreshType data_refresh_type = 15;</code>
   */
  int getDataRefreshTypeValue();
  /**
   * <pre>
   * Specifies whether the data source supports automatic data refresh for the
   * past few days, and how it's supported.
   * For some data sources, data might not be complete until a few days later,
   * so it's useful to refresh data automatically.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSource.DataRefreshType data_refresh_type = 15;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.DataSource.DataRefreshType getDataRefreshType();

  /**
   * <pre>
   * Default data refresh window on days.
   * Only meaningful when `data_refresh_type` = `SLIDING_WINDOW`.
   * </pre>
   *
   * <code>int32 default_data_refresh_window_days = 16;</code>
   */
  int getDefaultDataRefreshWindowDays();

  /**
   * <pre>
   * Disables backfilling and manual run scheduling
   * for the data source.
   * </pre>
   *
   * <code>bool manual_runs_disabled = 17;</code>
   */
  boolean getManualRunsDisabled();

  /**
   * <pre>
   * The minimum interval for scheduler to schedule runs.
   * </pre>
   *
   * <code>.google.protobuf.Duration minimum_schedule_interval = 18;</code>
   */
  boolean hasMinimumScheduleInterval();
  /**
   * <pre>
   * The minimum interval for scheduler to schedule runs.
   * </pre>
   *
   * <code>.google.protobuf.Duration minimum_schedule_interval = 18;</code>
   */
  com.google.protobuf.Duration getMinimumScheduleInterval();
  /**
   * <pre>
   * The minimum interval for scheduler to schedule runs.
   * </pre>
   *
   * <code>.google.protobuf.Duration minimum_schedule_interval = 18;</code>
   */
  com.google.protobuf.DurationOrBuilder getMinimumScheduleIntervalOrBuilder();
}
