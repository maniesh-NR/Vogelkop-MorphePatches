package defpackage;

import defpackage.aad;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a85 {
    private final y75 output;

    private a85(y75 y75Var) {
        y75 y75Var2 = (y75) ifb.checkNotNull(y75Var, "output");
        this.output = y75Var2;
        y75Var2.wrapper = this;
    }

    public static a85 forCodedOutput(y75 y75Var) {
        Object obj = y75Var.wrapper;
        return obj != null ? (a85) obj : new a85(y75Var);
    }

    private void writeBoolListInternal(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.output.writeBool(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeBoolSizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeBoolSizeNoTag += y75.computeBoolSizeNoTag(list.get(i3).booleanValue());
        }
        this.output.writeUInt32NoTag(iComputeBoolSizeNoTag);
        while (i2 < list.size()) {
            this.output.writeBoolNoTag(list.get(i2).booleanValue());
            i2++;
        }
    }

    private void writeBoolListInternal(int i, ln3 ln3Var, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < ln3Var.size()) {
                this.output.writeBool(i, ln3Var.getBoolean(i2));
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeBoolSizeNoTag = 0;
        for (int i3 = 0; i3 < ln3Var.size(); i3++) {
            iComputeBoolSizeNoTag += y75.computeBoolSizeNoTag(ln3Var.getBoolean(i3));
        }
        this.output.writeUInt32NoTag(iComputeBoolSizeNoTag);
        while (i2 < ln3Var.size()) {
            this.output.writeBoolNoTag(ln3Var.getBoolean(i2));
            i2++;
        }
    }

    private <V> void writeDeterministicBooleanMapEntry(int i, boolean z, V v, aad.a aVar) {
        this.output.writeTag(i, 2);
        this.output.writeUInt32NoTag(aad.computeSerializedSize(aVar, Boolean.valueOf(z), v));
        aad.writeTo(this.output, aVar, Boolean.valueOf(z), v);
    }

    private <V> void writeDeterministicIntegerMap(int i, aad.a aVar, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = it.next().intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(Integer.valueOf(i4));
            this.output.writeTag(i, 2);
            this.output.writeUInt32NoTag(aad.computeSerializedSize(aVar, Integer.valueOf(i4), v));
            aad.writeTo(this.output, aVar, Integer.valueOf(i4), v);
        }
    }

    private <V> void writeDeterministicLongMap(int i, aad.a aVar, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(Long.valueOf(j));
            this.output.writeTag(i, 2);
            this.output.writeUInt32NoTag(aad.computeSerializedSize(aVar, Long.valueOf(j), v));
            aad.writeTo(this.output, aVar, Long.valueOf(j), v);
        }
    }

    private <K, V> void writeDeterministicMap(int i, aad.a aVar, Map<K, V> map) {
        switch (z75.$SwitchMap$com$google$protobuf$WireFormat$FieldType[aVar.keyType.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    writeDeterministicBooleanMapEntry(i, false, v, aVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    writeDeterministicBooleanMapEntry(i, true, v2, aVar);
                    break;
                }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                writeDeterministicIntegerMap(i, aVar, map);
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                writeDeterministicLongMap(i, aVar, map);
                break;
            case 12:
                writeDeterministicStringMap(i, aVar, map);
                break;
            default:
                t3p.i(aVar.keyType, "does not support key type: ");
                break;
        }
    }

    private <V> void writeDeterministicStringMap(int i, aad.a aVar, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            strArr[i2] = it.next();
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str = strArr[i3];
            V v = map.get(str);
            this.output.writeTag(i, 2);
            this.output.writeUInt32NoTag(aad.computeSerializedSize(aVar, str, v));
            aad.writeTo(this.output, aVar, str, v);
        }
    }

    private void writeDoubleListInternal(int i, ee7 ee7Var, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < ee7Var.size()) {
                this.output.writeDouble(i, ee7Var.getDouble(i2));
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeDoubleSizeNoTag = 0;
        for (int i3 = 0; i3 < ee7Var.size(); i3++) {
            iComputeDoubleSizeNoTag += y75.computeDoubleSizeNoTag(ee7Var.getDouble(i3));
        }
        this.output.writeUInt32NoTag(iComputeDoubleSizeNoTag);
        while (i2 < ee7Var.size()) {
            this.output.writeDoubleNoTag(ee7Var.getDouble(i2));
            i2++;
        }
    }

    private void writeDoubleListInternal(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.output.writeDouble(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeDoubleSizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeDoubleSizeNoTag += y75.computeDoubleSizeNoTag(list.get(i3).doubleValue());
        }
        this.output.writeUInt32NoTag(iComputeDoubleSizeNoTag);
        while (i2 < list.size()) {
            this.output.writeDoubleNoTag(list.get(i2).doubleValue());
            i2++;
        }
    }

    private void writeEnumListInternal(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.output.writeEnum(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeEnumSizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeEnumSizeNoTag += y75.computeEnumSizeNoTag(list.get(i3).intValue());
        }
        this.output.writeUInt32NoTag(iComputeEnumSizeNoTag);
        while (i2 < list.size()) {
            this.output.writeEnumNoTag(list.get(i2).intValue());
            i2++;
        }
    }

    private void writeEnumListInternal(int i, nbb nbbVar, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < nbbVar.size()) {
                this.output.writeEnum(i, nbbVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeEnumSizeNoTag = 0;
        for (int i3 = 0; i3 < nbbVar.size(); i3++) {
            iComputeEnumSizeNoTag += y75.computeEnumSizeNoTag(nbbVar.getInt(i3));
        }
        this.output.writeUInt32NoTag(iComputeEnumSizeNoTag);
        while (i2 < nbbVar.size()) {
            this.output.writeEnumNoTag(nbbVar.getInt(i2));
            i2++;
        }
    }

    private void writeFixed32ListInternal(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.output.writeFixed32(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeFixed32SizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeFixed32SizeNoTag += y75.computeFixed32SizeNoTag(list.get(i3).intValue());
        }
        this.output.writeUInt32NoTag(iComputeFixed32SizeNoTag);
        while (i2 < list.size()) {
            this.output.writeFixed32NoTag(list.get(i2).intValue());
            i2++;
        }
    }

    private void writeFixed32ListInternal(int i, nbb nbbVar, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < nbbVar.size()) {
                this.output.writeFixed32(i, nbbVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeFixed32SizeNoTag = 0;
        for (int i3 = 0; i3 < nbbVar.size(); i3++) {
            iComputeFixed32SizeNoTag += y75.computeFixed32SizeNoTag(nbbVar.getInt(i3));
        }
        this.output.writeUInt32NoTag(iComputeFixed32SizeNoTag);
        while (i2 < nbbVar.size()) {
            this.output.writeFixed32NoTag(nbbVar.getInt(i2));
            i2++;
        }
    }

    private void writeFixed64ListInternal(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.output.writeFixed64(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeFixed64SizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeFixed64SizeNoTag += y75.computeFixed64SizeNoTag(list.get(i3).longValue());
        }
        this.output.writeUInt32NoTag(iComputeFixed64SizeNoTag);
        while (i2 < list.size()) {
            this.output.writeFixed64NoTag(list.get(i2).longValue());
            i2++;
        }
    }

    private void writeFixed64ListInternal(int i, m0d m0dVar, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < m0dVar.size()) {
                this.output.writeFixed64(i, m0dVar.getLong(i2));
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeFixed64SizeNoTag = 0;
        for (int i3 = 0; i3 < m0dVar.size(); i3++) {
            iComputeFixed64SizeNoTag += y75.computeFixed64SizeNoTag(m0dVar.getLong(i3));
        }
        this.output.writeUInt32NoTag(iComputeFixed64SizeNoTag);
        while (i2 < m0dVar.size()) {
            this.output.writeFixed64NoTag(m0dVar.getLong(i2));
            i2++;
        }
    }

    private void writeFloatListInternal(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.output.writeFloat(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeFloatSizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeFloatSizeNoTag += y75.computeFloatSizeNoTag(list.get(i3).floatValue());
        }
        this.output.writeUInt32NoTag(iComputeFloatSizeNoTag);
        while (i2 < list.size()) {
            this.output.writeFloatNoTag(list.get(i2).floatValue());
            i2++;
        }
    }

    private void writeFloatListInternal(int i, q89 q89Var, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < q89Var.size()) {
                this.output.writeFloat(i, q89Var.getFloat(i2));
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeFloatSizeNoTag = 0;
        for (int i3 = 0; i3 < q89Var.size(); i3++) {
            iComputeFloatSizeNoTag += y75.computeFloatSizeNoTag(q89Var.getFloat(i3));
        }
        this.output.writeUInt32NoTag(iComputeFloatSizeNoTag);
        while (i2 < q89Var.size()) {
            this.output.writeFloatNoTag(q89Var.getFloat(i2));
            i2++;
        }
    }

    private void writeInt32ListInternal(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.output.writeInt32(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeInt32SizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeInt32SizeNoTag += y75.computeInt32SizeNoTag(list.get(i3).intValue());
        }
        this.output.writeUInt32NoTag(iComputeInt32SizeNoTag);
        while (i2 < list.size()) {
            this.output.writeInt32NoTag(list.get(i2).intValue());
            i2++;
        }
    }

    private void writeInt32ListInternal(int i, nbb nbbVar, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < nbbVar.size()) {
                this.output.writeInt32(i, nbbVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeInt32SizeNoTag = 0;
        for (int i3 = 0; i3 < nbbVar.size(); i3++) {
            iComputeInt32SizeNoTag += y75.computeInt32SizeNoTag(nbbVar.getInt(i3));
        }
        this.output.writeUInt32NoTag(iComputeInt32SizeNoTag);
        while (i2 < nbbVar.size()) {
            this.output.writeInt32NoTag(nbbVar.getInt(i2));
            i2++;
        }
    }

    private void writeInt64ListInternal(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.output.writeInt64(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeInt64SizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeInt64SizeNoTag += y75.computeInt64SizeNoTag(list.get(i3).longValue());
        }
        this.output.writeUInt32NoTag(iComputeInt64SizeNoTag);
        while (i2 < list.size()) {
            this.output.writeInt64NoTag(list.get(i2).longValue());
            i2++;
        }
    }

    private void writeInt64ListInternal(int i, m0d m0dVar, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < m0dVar.size()) {
                this.output.writeInt64(i, m0dVar.getLong(i2));
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeInt64SizeNoTag = 0;
        for (int i3 = 0; i3 < m0dVar.size(); i3++) {
            iComputeInt64SizeNoTag += y75.computeInt64SizeNoTag(m0dVar.getLong(i3));
        }
        this.output.writeUInt32NoTag(iComputeInt64SizeNoTag);
        while (i2 < m0dVar.size()) {
            this.output.writeInt64NoTag(m0dVar.getLong(i2));
            i2++;
        }
    }

    private void writeLazyString(int i, Object obj) {
        boolean z = obj instanceof String;
        y75 y75Var = this.output;
        if (z) {
            y75Var.writeString(i, (String) obj);
        } else {
            y75Var.writeBytes(i, (v44) obj);
        }
    }

    private void writeSFixed32ListInternal(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.output.writeSFixed32(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeSFixed32SizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeSFixed32SizeNoTag += y75.computeSFixed32SizeNoTag(list.get(i3).intValue());
        }
        this.output.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
        while (i2 < list.size()) {
            this.output.writeSFixed32NoTag(list.get(i2).intValue());
            i2++;
        }
    }

    private void writeSFixed32ListInternal(int i, nbb nbbVar, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < nbbVar.size()) {
                this.output.writeSFixed32(i, nbbVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeSFixed32SizeNoTag = 0;
        for (int i3 = 0; i3 < nbbVar.size(); i3++) {
            iComputeSFixed32SizeNoTag += y75.computeSFixed32SizeNoTag(nbbVar.getInt(i3));
        }
        this.output.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
        while (i2 < nbbVar.size()) {
            this.output.writeSFixed32NoTag(nbbVar.getInt(i2));
            i2++;
        }
    }

    private void writeSFixed64ListInternal(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.output.writeSFixed64(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeSFixed64SizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeSFixed64SizeNoTag += y75.computeSFixed64SizeNoTag(list.get(i3).longValue());
        }
        this.output.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
        while (i2 < list.size()) {
            this.output.writeSFixed64NoTag(list.get(i2).longValue());
            i2++;
        }
    }

    private void writeSFixed64ListInternal(int i, m0d m0dVar, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < m0dVar.size()) {
                this.output.writeSFixed64(i, m0dVar.getLong(i2));
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeSFixed64SizeNoTag = 0;
        for (int i3 = 0; i3 < m0dVar.size(); i3++) {
            iComputeSFixed64SizeNoTag += y75.computeSFixed64SizeNoTag(m0dVar.getLong(i3));
        }
        this.output.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
        while (i2 < m0dVar.size()) {
            this.output.writeSFixed64NoTag(m0dVar.getLong(i2));
            i2++;
        }
    }

    private void writeSInt32ListInternal(int i, nbb nbbVar, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < nbbVar.size()) {
                this.output.writeSInt32(i, nbbVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeSInt32SizeNoTag = 0;
        for (int i3 = 0; i3 < nbbVar.size(); i3++) {
            iComputeSInt32SizeNoTag += y75.computeSInt32SizeNoTag(nbbVar.getInt(i3));
        }
        this.output.writeUInt32NoTag(iComputeSInt32SizeNoTag);
        while (i2 < nbbVar.size()) {
            this.output.writeSInt32NoTag(nbbVar.getInt(i2));
            i2++;
        }
    }

    private void writeSInt64ListInternal(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.output.writeSInt64(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeSInt64SizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeSInt64SizeNoTag += y75.computeSInt64SizeNoTag(list.get(i3).longValue());
        }
        this.output.writeUInt32NoTag(iComputeSInt64SizeNoTag);
        while (i2 < list.size()) {
            this.output.writeSInt64NoTag(list.get(i2).longValue());
            i2++;
        }
    }

    private void writeSInt64ListInternal(int i, m0d m0dVar, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < m0dVar.size()) {
                this.output.writeSInt64(i, m0dVar.getLong(i2));
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeSInt64SizeNoTag = 0;
        for (int i3 = 0; i3 < m0dVar.size(); i3++) {
            iComputeSInt64SizeNoTag += y75.computeSInt64SizeNoTag(m0dVar.getLong(i3));
        }
        this.output.writeUInt32NoTag(iComputeSInt64SizeNoTag);
        while (i2 < m0dVar.size()) {
            this.output.writeSInt64NoTag(m0dVar.getLong(i2));
            i2++;
        }
    }

    private void writeUInt32ListInternal(int i, nbb nbbVar, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < nbbVar.size()) {
                this.output.writeUInt32(i, nbbVar.getInt(i2));
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeUInt32SizeNoTag = 0;
        for (int i3 = 0; i3 < nbbVar.size(); i3++) {
            iComputeUInt32SizeNoTag += y75.computeUInt32SizeNoTag(nbbVar.getInt(i3));
        }
        this.output.writeUInt32NoTag(iComputeUInt32SizeNoTag);
        while (i2 < nbbVar.size()) {
            this.output.writeUInt32NoTag(nbbVar.getInt(i2));
            i2++;
        }
    }

    private void writeUInt64ListInternal(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.output.writeUInt64(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeUInt64SizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeUInt64SizeNoTag += y75.computeUInt64SizeNoTag(list.get(i3).longValue());
        }
        this.output.writeUInt32NoTag(iComputeUInt64SizeNoTag);
        while (i2 < list.size()) {
            this.output.writeUInt64NoTag(list.get(i2).longValue());
            i2++;
        }
    }

    private void writeUInt64ListInternal(int i, m0d m0dVar, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < m0dVar.size()) {
                this.output.writeUInt64(i, m0dVar.getLong(i2));
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeUInt64SizeNoTag = 0;
        for (int i3 = 0; i3 < m0dVar.size(); i3++) {
            iComputeUInt64SizeNoTag += y75.computeUInt64SizeNoTag(m0dVar.getLong(i3));
        }
        this.output.writeUInt32NoTag(iComputeUInt64SizeNoTag);
        while (i2 < m0dVar.size()) {
            this.output.writeUInt64NoTag(m0dVar.getLong(i2));
            i2++;
        }
    }

    public int getTotalBytesWritten() {
        return this.output.getTotalBytesWritten();
    }

    public void writeBool(int i, boolean z) {
        this.output.writeBool(i, z);
    }

    public void writeBoolList(int i, List<Boolean> list, boolean z) {
        if (list instanceof ln3) {
            writeBoolListInternal(i, (ln3) list, z);
        } else {
            writeBoolListInternal(i, list, z);
        }
    }

    public void writeBytes(int i, v44 v44Var) {
        this.output.writeBytes(i, v44Var);
    }

    public void writeBytesList(int i, List<v44> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.output.writeBytes(i, list.get(i2));
        }
    }

    public void writeDouble(int i, double d) {
        this.output.writeDouble(i, d);
    }

    public void writeDoubleList(int i, List<Double> list, boolean z) {
        if (list instanceof ee7) {
            writeDoubleListInternal(i, (ee7) list, z);
        } else {
            writeDoubleListInternal(i, list, z);
        }
    }

    @Deprecated
    public void writeEndGroup(int i) {
        this.output.writeTag(i, 4);
    }

    public void writeEnum(int i, int i2) {
        this.output.writeEnum(i, i2);
    }

    public void writeEnumList(int i, List<Integer> list, boolean z) {
        if (list instanceof nbb) {
            writeEnumListInternal(i, (nbb) list, z);
        } else {
            writeEnumListInternal(i, list, z);
        }
    }

    public void writeFixed32(int i, int i2) {
        this.output.writeFixed32(i, i2);
    }

    public void writeFixed32List(int i, List<Integer> list, boolean z) {
        if (list instanceof nbb) {
            writeFixed32ListInternal(i, (nbb) list, z);
        } else {
            writeFixed32ListInternal(i, list, z);
        }
    }

    public void writeFixed64(int i, long j) {
        this.output.writeFixed64(i, j);
    }

    public void writeFixed64List(int i, List<Long> list, boolean z) {
        if (list instanceof m0d) {
            writeFixed64ListInternal(i, (m0d) list, z);
        } else {
            writeFixed64ListInternal(i, list, z);
        }
    }

    public void writeFloat(int i, float f) {
        this.output.writeFloat(i, f);
    }

    public void writeFloatList(int i, List<Float> list, boolean z) {
        if (list instanceof q89) {
            writeFloatListInternal(i, (q89) list, z);
        } else {
            writeFloatListInternal(i, list, z);
        }
    }

    @Deprecated
    public void writeGroup(int i, Object obj) {
        this.output.writeGroup(i, (rvd) obj);
    }

    public void writeGroup(int i, Object obj, ani aniVar) {
        this.output.writeTag(i, 3);
        aniVar.writeTo((w5) obj, this);
        this.output.writeTag(i, 4);
    }

    @Deprecated
    public void writeGroupList(int i, List<?> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            writeGroup(i, list.get(i2));
        }
    }

    public void writeGroupList(int i, List<?> list, ani aniVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            writeGroup(i, list.get(i2), aniVar);
        }
    }

    public void writeInt32(int i, int i2) {
        this.output.writeInt32(i, i2);
    }

    public void writeInt32List(int i, List<Integer> list, boolean z) {
        if (list instanceof nbb) {
            writeInt32ListInternal(i, (nbb) list, z);
        } else {
            writeInt32ListInternal(i, list, z);
        }
    }

    public void writeInt64(int i, long j) {
        this.output.writeInt64(i, j);
    }

    public void writeInt64List(int i, List<Long> list, boolean z) {
        if (list instanceof m0d) {
            writeInt64ListInternal(i, (m0d) list, z);
        } else {
            writeInt64ListInternal(i, list, z);
        }
    }

    public <K, V> void writeMap(int i, aad.a aVar, Map<K, V> map) {
        if (this.output.isSerializationDeterministic()) {
            writeDeterministicMap(i, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.output.writeTag(i, 2);
            this.output.writeUInt32NoTag(aad.computeSerializedSize(aVar, entry.getKey(), entry.getValue()));
            aad.writeTo(this.output, aVar, entry.getKey(), entry.getValue());
        }
    }

    public void writeMessage(int i, Object obj) {
        this.output.writeMessage(i, (rvd) obj);
    }

    public void writeMessage(int i, Object obj, ani aniVar) {
        w5 w5Var = (w5) obj;
        this.output.writeTag(i, 2);
        this.output.writeUInt32NoTag(w5Var.getSerializedSize(aniVar));
        aniVar.writeTo(w5Var, this);
    }

    public void writeMessageList(int i, List<?> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            writeMessage(i, list.get(i2));
        }
    }

    public void writeMessageList(int i, List<?> list, ani aniVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            writeMessage(i, list.get(i2), aniVar);
        }
    }

    public final void writeMessageSetItem(int i, Object obj) {
        boolean z = obj instanceof v44;
        y75 y75Var = this.output;
        if (z) {
            y75Var.writeRawMessageSetExtension(i, (v44) obj);
        } else {
            y75Var.writeMessageSetExtension(i, (rvd) obj);
        }
    }

    public void writeSFixed32(int i, int i2) {
        this.output.writeSFixed32(i, i2);
    }

    public void writeSFixed32List(int i, List<Integer> list, boolean z) {
        if (list instanceof nbb) {
            writeSFixed32ListInternal(i, (nbb) list, z);
        } else {
            writeSFixed32ListInternal(i, list, z);
        }
    }

    public void writeSFixed64(int i, long j) {
        this.output.writeSFixed64(i, j);
    }

    public void writeSFixed64List(int i, List<Long> list, boolean z) {
        if (list instanceof m0d) {
            writeSFixed64ListInternal(i, (m0d) list, z);
        } else {
            writeSFixed64ListInternal(i, list, z);
        }
    }

    public void writeSInt32(int i, int i2) {
        this.output.writeSInt32(i, i2);
    }

    public void writeSInt32List(int i, List<Integer> list, boolean z) {
        if (list instanceof nbb) {
            writeSInt32ListInternal(i, (nbb) list, z);
        } else {
            writeSInt32ListInternal(i, list, z);
        }
    }

    public void writeSInt32ListInternal(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.output.writeSInt32(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeSInt32SizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeSInt32SizeNoTag += y75.computeSInt32SizeNoTag(list.get(i3).intValue());
        }
        this.output.writeUInt32NoTag(iComputeSInt32SizeNoTag);
        while (i2 < list.size()) {
            this.output.writeSInt32NoTag(list.get(i2).intValue());
            i2++;
        }
    }

    public void writeSInt64(int i, long j) {
        this.output.writeSInt64(i, j);
    }

    public void writeSInt64List(int i, List<Long> list, boolean z) {
        if (list instanceof m0d) {
            writeSInt64ListInternal(i, (m0d) list, z);
        } else {
            writeSInt64ListInternal(i, list, z);
        }
    }

    @Deprecated
    public void writeStartGroup(int i) {
        this.output.writeTag(i, 3);
    }

    public void writeString(int i, String str) {
        this.output.writeString(i, str);
    }

    public void writeStringList(int i, List<String> list) {
        int i2 = 0;
        if (!(list instanceof d7c)) {
            while (i2 < list.size()) {
                this.output.writeString(i, list.get(i2));
                i2++;
            }
        } else {
            d7c d7cVar = (d7c) list;
            while (i2 < list.size()) {
                writeLazyString(i, d7cVar.k());
                i2++;
            }
        }
    }

    public void writeUInt32(int i, int i2) {
        this.output.writeUInt32(i, i2);
    }

    public void writeUInt32List(int i, List<Integer> list, boolean z) {
        if (list instanceof nbb) {
            writeUInt32ListInternal(i, (nbb) list, z);
        } else {
            writeUInt32ListInternal(i, list, z);
        }
    }

    public void writeUInt32ListInternal(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.output.writeUInt32(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeUInt32SizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeUInt32SizeNoTag += y75.computeUInt32SizeNoTag(list.get(i3).intValue());
        }
        this.output.writeUInt32NoTag(iComputeUInt32SizeNoTag);
        while (i2 < list.size()) {
            this.output.writeUInt32NoTag(list.get(i2).intValue());
            i2++;
        }
    }

    public void writeUInt64(int i, long j) {
        this.output.writeUInt64(i, j);
    }

    public void writeUInt64List(int i, List<Long> list, boolean z) {
        if (list instanceof m0d) {
            writeUInt64ListInternal(i, (m0d) list, z);
        } else {
            writeUInt64ListInternal(i, list, z);
        }
    }
}
