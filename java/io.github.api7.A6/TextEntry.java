// automatically generated by the FlatBuffers compiler, do not modify

package io.github.api7.A6;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class TextEntry extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static TextEntry getRootAsTextEntry(ByteBuffer _bb) { return getRootAsTextEntry(_bb, new TextEntry()); }
  public static TextEntry getRootAsTextEntry(ByteBuffer _bb, TextEntry obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public TextEntry __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String value() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer valueAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer valueInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }

  public static int createTextEntry(FlatBufferBuilder builder,
      int nameOffset,
      int valueOffset) {
    builder.startTable(2);
    TextEntry.addValue(builder, valueOffset);
    TextEntry.addName(builder, nameOffset);
    return TextEntry.endTextEntry(builder);
  }

  public static void startTextEntry(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addValue(FlatBufferBuilder builder, int valueOffset) { builder.addOffset(1, valueOffset, 0); }
  public static int endTextEntry(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public TextEntry get(int j) { return get(new TextEntry(), j); }
    public TextEntry get(TextEntry obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

