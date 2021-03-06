// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

package com.google.cloud.videointelligence.v1;

public interface SpeechTranscriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.SpeechTranscription)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * May contain one or more recognition hypotheses (up to the maximum specified
   * in `max_alternatives`).  These alternatives are ordered in terms of
   * accuracy, with the top (first) alternative being the most probable, as
   * ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.SpeechRecognitionAlternative> 
      getAlternativesList();
  /**
   * <pre>
   * May contain one or more recognition hypotheses (up to the maximum specified
   * in `max_alternatives`).  These alternatives are ordered in terms of
   * accuracy, with the top (first) alternative being the most probable, as
   * ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  com.google.cloud.videointelligence.v1.SpeechRecognitionAlternative getAlternatives(int index);
  /**
   * <pre>
   * May contain one or more recognition hypotheses (up to the maximum specified
   * in `max_alternatives`).  These alternatives are ordered in terms of
   * accuracy, with the top (first) alternative being the most probable, as
   * ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  int getAlternativesCount();
  /**
   * <pre>
   * May contain one or more recognition hypotheses (up to the maximum specified
   * in `max_alternatives`).  These alternatives are ordered in terms of
   * accuracy, with the top (first) alternative being the most probable, as
   * ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.SpeechRecognitionAlternativeOrBuilder> 
      getAlternativesOrBuilderList();
  /**
   * <pre>
   * May contain one or more recognition hypotheses (up to the maximum specified
   * in `max_alternatives`).  These alternatives are ordered in terms of
   * accuracy, with the top (first) alternative being the most probable, as
   * ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  com.google.cloud.videointelligence.v1.SpeechRecognitionAlternativeOrBuilder getAlternativesOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. The
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag of the
   * language in this result. This language code was detected to have the most
   * likelihood of being spoken in the audio.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * Output only. The
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag of the
   * language in this result. This language code was detected to have the most
   * likelihood of being spoken in the audio.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();
}
