package defpackage;

import defpackage.j4o;
import defpackage.mgb;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class twd implements ani {
    private final rvd defaultInstance;
    private final bl8 extensionSchema;
    private final boolean hasExtensions;
    private final bmm unknownFieldSchema;

    private twd(bmm bmmVar, bl8 bl8Var, rvd rvdVar) {
        this.unknownFieldSchema = bmmVar;
        this.hasExtensions = bl8Var.hasExtensions(rvdVar);
        this.extensionSchema = bl8Var;
        this.defaultInstance = rvdVar;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(bmm bmmVar, Object obj) {
        return bmmVar.getSerializedSizeAsMessageSet(bmmVar.getFromMessage(obj));
    }

    private <UT, UB, ET extends e09> void mergeFromHelper(bmm bmmVar, bl8 bl8Var, Object obj, u75 u75Var, yk8 yk8Var) throws Throwable {
        bmm bmmVar2;
        Object builderFromMessage = bmmVar.getBuilderFromMessage(obj);
        f09 mutableExtensions = bl8Var.getMutableExtensions(obj);
        while (u75Var.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                twd twdVar = this;
                bmmVar2 = bmmVar;
                bl8 bl8Var2 = bl8Var;
                u75 u75Var2 = u75Var;
                yk8 yk8Var2 = yk8Var;
                try {
                    if (!twdVar.parseMessageSetItemOrUnknownField(u75Var2, yk8Var2, bl8Var2, mutableExtensions, bmmVar2, builderFromMessage)) {
                        bmmVar2.setBuilderToMessage(obj, builderFromMessage);
                        return;
                    }
                    this = twdVar;
                    u75Var = u75Var2;
                    yk8Var = yk8Var2;
                    bl8Var = bl8Var2;
                    bmmVar = bmmVar2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    bmmVar2.setBuilderToMessage(obj, builderFromMessage);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                bmmVar2 = bmmVar;
            }
        }
        bmmVar.setBuilderToMessage(obj, builderFromMessage);
    }

    public static <T> twd newSchema(bmm bmmVar, bl8 bl8Var, rvd rvdVar) {
        return new twd(bmmVar, bl8Var, rvdVar);
    }

    private <UT, UB, ET extends e09> boolean parseMessageSetItemOrUnknownField(u75 u75Var, yk8 yk8Var, bl8 bl8Var, f09 f09Var, bmm bmmVar, UB ub) throws bjb {
        int tag = u75Var.getTag();
        int uInt32 = 0;
        if (tag != j4o.MESSAGE_SET_ITEM_TAG) {
            if (j4o.getTagWireType(tag) != 2) {
                return u75Var.skipField();
            }
            Object objFindExtensionByNumber = bl8Var.findExtensionByNumber(yk8Var, this.defaultInstance, j4o.getTagFieldNumber(tag));
            if (objFindExtensionByNumber == null) {
                return bmmVar.mergeOneFieldFrom(ub, u75Var, 0);
            }
            bl8Var.parseLengthPrefixedMessageSetItem(u75Var, objFindExtensionByNumber, yk8Var, f09Var);
            return true;
        }
        Object objFindExtensionByNumber2 = null;
        v44 bytes = null;
        while (u75Var.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = u75Var.getTag();
            if (tag2 == j4o.MESSAGE_SET_TYPE_ID_TAG) {
                uInt32 = u75Var.readUInt32();
                objFindExtensionByNumber2 = bl8Var.findExtensionByNumber(yk8Var, this.defaultInstance, uInt32);
            } else if (tag2 == j4o.MESSAGE_SET_MESSAGE_TAG) {
                if (objFindExtensionByNumber2 != null) {
                    bl8Var.parseLengthPrefixedMessageSetItem(u75Var, objFindExtensionByNumber2, yk8Var, f09Var);
                } else {
                    bytes = u75Var.readBytes();
                }
            } else if (tag2 == j4o.MESSAGE_SET_ITEM_END_TAG || !u75Var.skipField()) {
                break;
            }
        }
        if (u75Var.getTag() != j4o.MESSAGE_SET_ITEM_END_TAG) {
            throw bjb.invalidEndTag();
        }
        if (bytes != null) {
            if (objFindExtensionByNumber2 != null) {
                bl8Var.parseMessageSetItem(bytes, objFindExtensionByNumber2, yk8Var, f09Var);
            } else {
                bmmVar.addLengthDelimited(ub, uInt32, bytes);
            }
        }
        return true;
    }

    private <UT, UB> void writeUnknownFieldsHelper(bmm bmmVar, Object obj, a85 a85Var) {
        bmmVar.writeAsMessageSetTo(bmmVar.getFromMessage(obj), a85Var);
    }

    @Override // defpackage.ani
    public boolean equals(Object obj, Object obj2) {
        if (!this.unknownFieldSchema.getFromMessage(obj).equals(this.unknownFieldSchema.getFromMessage(obj2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(obj).equals(this.extensionSchema.getExtensions(obj2));
        }
        return true;
    }

    @Override // defpackage.ani
    public int getSerializedSize(Object obj) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj);
        return this.hasExtensions ? this.extensionSchema.getExtensions(obj).getMessageSetSerializedSize() + unknownFieldsSerializedSize : unknownFieldsSerializedSize;
    }

    @Override // defpackage.ani
    public int hashCode(Object obj) {
        int iHashCode = this.unknownFieldSchema.getFromMessage(obj).hashCode();
        if (!this.hasExtensions) {
            return iHashCode;
        }
        return this.extensionSchema.getExtensions(obj).hashCode() + (iHashCode * 53);
    }

    @Override // defpackage.ani
    public final boolean isInitialized(Object obj) {
        return this.extensionSchema.getExtensions(obj).isInitialized();
    }

    @Override // defpackage.ani
    public void makeImmutable(Object obj) {
        this.unknownFieldSchema.makeImmutable(obj);
        this.extensionSchema.makeImmutable(obj);
    }

    @Override // defpackage.ani
    public void mergeFrom(Object obj, Object obj2) {
        fni.mergeUnknownFields(this.unknownFieldSchema, obj, obj2);
        if (this.hasExtensions) {
            fni.mergeExtensions(this.extensionSchema, obj, obj2);
        }
    }

    @Override // defpackage.ani
    public void mergeFrom(Object obj, u75 u75Var, yk8 yk8Var) throws Throwable {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, obj, u75Var, yk8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d1 A[EDGE_INSN: B:60:0x00d1->B:32:0x00d1 BREAK  A[LOOP:1: B:17:0x0071->B:63:0x0071], SYNTHETIC] */
    @Override // defpackage.ani
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mergeFrom(java.lang.Object r11, byte[] r12, int r13, int r14, g72.a r15) throws defpackage.bjb {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twd.mergeFrom(java.lang.Object, byte[], int, int, g72$a):void");
    }

    @Override // defpackage.ani
    public Object newInstance() {
        rvd rvdVar = this.defaultInstance;
        return rvdVar instanceof gv9 ? ((gv9) rvdVar).newMutableInstance() : rvdVar.newBuilderForType().buildPartial();
    }

    @Override // defpackage.ani
    public void writeTo(Object obj, a85 a85Var) {
        Iterator<Map.Entry<e09, Object>> it = this.extensionSchema.getExtensions(obj).iterator();
        while (it.hasNext()) {
            Map.Entry<e09, Object> next = it.next();
            e09 key = next.getKey();
            if (key.getLiteJavaType() != j4o.b.MESSAGE || key.isRepeated() || key.isPacked()) {
                qp2.n("Found invalid MessageSet item.");
                return;
            } else if (next instanceof mgb.a) {
                a85Var.writeMessageSetItem(key.getNumber(), ((mgb.a) next).getField().toByteString());
            } else {
                a85Var.writeMessageSetItem(key.getNumber(), next.getValue());
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, obj, a85Var);
    }
}
