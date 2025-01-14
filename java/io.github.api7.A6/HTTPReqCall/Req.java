// automatically generated by the FlatBuffers compiler, do not modify

package io.github.api7.A6.HTTPReqCall;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Req extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static Req getRootAsReq(ByteBuffer _bb) { return getRootAsReq(_bb, new Req()); }
  public static Req getRootAsReq(ByteBuffer _bb, Req obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Req __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long id() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public int srcIp(int j) { int o = __offset(6); return o != 0 ? bb.get(__vector(o) + j * 1) & 0xFF : 0; }
  public int srcIpLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public ByteVector srcIpVector() { return srcIpVector(new ByteVector()); }
  public ByteVector srcIpVector(ByteVector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer srcIpAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer srcIpInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public int method() { int o = __offset(8); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public String path() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer pathAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public ByteBuffer pathInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 1); }
  public io.github.api7.A6.TextEntry args(int j) { return args(new io.github.api7.A6.TextEntry(), j); }
  public io.github.api7.A6.TextEntry args(io.github.api7.A6.TextEntry obj, int j) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int argsLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public io.github.api7.A6.TextEntry.Vector argsVector() { return argsVector(new io.github.api7.A6.TextEntry.Vector()); }
  public io.github.api7.A6.TextEntry.Vector argsVector(io.github.api7.A6.TextEntry.Vector obj) { int o = __offset(12); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public io.github.api7.A6.TextEntry headers(int j) { return headers(new io.github.api7.A6.TextEntry(), j); }
  public io.github.api7.A6.TextEntry headers(io.github.api7.A6.TextEntry obj, int j) { int o = __offset(14); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int headersLength() { int o = __offset(14); return o != 0 ? __vector_len(o) : 0; }
  public io.github.api7.A6.TextEntry.Vector headersVector() { return headersVector(new io.github.api7.A6.TextEntry.Vector()); }
  public io.github.api7.A6.TextEntry.Vector headersVector(io.github.api7.A6.TextEntry.Vector obj) { int o = __offset(14); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public long confToken() { int o = __offset(16); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public io.github.api7.A6.DataEntry extraInfo(int j) { return extraInfo(new io.github.api7.A6.DataEntry(), j); }
  public io.github.api7.A6.DataEntry extraInfo(io.github.api7.A6.DataEntry obj, int j) { int o = __offset(18); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int extraInfoLength() { int o = __offset(18); return o != 0 ? __vector_len(o) : 0; }
  public io.github.api7.A6.DataEntry.Vector extraInfoVector() { return extraInfoVector(new io.github.api7.A6.DataEntry.Vector()); }
  public io.github.api7.A6.DataEntry.Vector extraInfoVector(io.github.api7.A6.DataEntry.Vector obj) { int o = __offset(18); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createReq(FlatBufferBuilder builder,
      long id,
      int src_ipOffset,
      int method,
      int pathOffset,
      int argsOffset,
      int headersOffset,
      long conf_token,
      int extra_infoOffset) {
    builder.startTable(8);
    Req.addExtraInfo(builder, extra_infoOffset);
    Req.addConfToken(builder, conf_token);
    Req.addHeaders(builder, headersOffset);
    Req.addArgs(builder, argsOffset);
    Req.addPath(builder, pathOffset);
    Req.addSrcIp(builder, src_ipOffset);
    Req.addId(builder, id);
    Req.addMethod(builder, method);
    return Req.endReq(builder);
  }

  public static void startReq(FlatBufferBuilder builder) { builder.startTable(8); }
  public static void addId(FlatBufferBuilder builder, long id) { builder.addInt(0, (int)id, (int)0L); }
  public static void addSrcIp(FlatBufferBuilder builder, int srcIpOffset) { builder.addOffset(1, srcIpOffset, 0); }
  public static int createSrcIpVector(FlatBufferBuilder builder, byte[] data) { return builder.createByteVector(data); }
  public static int createSrcIpVector(FlatBufferBuilder builder, ByteBuffer data) { return builder.createByteVector(data); }
  public static void startSrcIpVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addMethod(FlatBufferBuilder builder, int method) { builder.addByte(2, (byte)method, (byte)0); }
  public static void addPath(FlatBufferBuilder builder, int pathOffset) { builder.addOffset(3, pathOffset, 0); }
  public static void addArgs(FlatBufferBuilder builder, int argsOffset) { builder.addOffset(4, argsOffset, 0); }
  public static int createArgsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startArgsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addHeaders(FlatBufferBuilder builder, int headersOffset) { builder.addOffset(5, headersOffset, 0); }
  public static int createHeadersVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startHeadersVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addConfToken(FlatBufferBuilder builder, long confToken) { builder.addInt(6, (int)confToken, (int)0L); }
  public static void addExtraInfo(FlatBufferBuilder builder, int extraInfoOffset) { builder.addOffset(7, extraInfoOffset, 0); }
  public static int createExtraInfoVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startExtraInfoVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endReq(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Req get(int j) { return get(new Req(), j); }
    public Req get(Req obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

