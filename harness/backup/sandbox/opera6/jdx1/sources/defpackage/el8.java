package defpackage;

import defpackage.bjb;
import defpackage.gv9;
import defpackage.j4o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class el8 extends bl8 {
    @Override // defpackage.bl8
    public int extensionNumber(Map.Entry<?, ?> entry) {
        return ((gv9.d) entry.getKey()).getNumber();
    }

    @Override // defpackage.bl8
    public Object findExtensionByNumber(yk8 yk8Var, rvd rvdVar, int i) {
        return yk8Var.findLiteExtensionByNumber(rvdVar, i);
    }

    @Override // defpackage.bl8
    public f09 getExtensions(Object obj) {
        return ((gv9.c) obj).extensions;
    }

    @Override // defpackage.bl8
    public f09 getMutableExtensions(Object obj) {
        return ((gv9.c) obj).ensureExtensionsAreMutable();
    }

    @Override // defpackage.bl8
    public boolean hasExtensions(rvd rvdVar) {
        return rvdVar instanceof gv9.c;
    }

    @Override // defpackage.bl8
    public void makeImmutable(Object obj) {
        getExtensions(obj).makeImmutable();
    }

    @Override // defpackage.bl8
    public <UT, UB> UB parseExtension(Object obj, u75 u75Var, Object obj2, yk8 yk8Var, f09 f09Var, UB ub, bmm bmmVar) throws bjb {
        Object field;
        ArrayList arrayList;
        gv9.e eVar = (gv9.e) obj2;
        int number = eVar.getNumber();
        Object objValueOf = null;
        if (eVar.descriptor.isRepeated() && eVar.descriptor.isPacked()) {
            switch (cl8.$SwitchMap$com$google$protobuf$WireFormat$FieldType[eVar.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    u75Var.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    u75Var.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    u75Var.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    u75Var.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    u75Var.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    u75Var.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    u75Var.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    u75Var.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    u75Var.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    u75Var.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    u75Var.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    u75Var.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    u75Var.readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    u75Var.readEnumList(arrayList);
                    ub = (UB) fni.filterUnknownEnumList(obj, number, arrayList, eVar.descriptor.getEnumType(), ub, bmmVar);
                    break;
                default:
                    j9h.u(eVar.descriptor.getLiteType(), "Type cannot be packed: ");
                    return null;
            }
            f09Var.setField(eVar.descriptor, arrayList);
            return ub;
        }
        if (eVar.getLiteType() != j4o.a.ENUM) {
            switch (cl8.$SwitchMap$com$google$protobuf$WireFormat$FieldType[eVar.getLiteType().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(u75Var.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(u75Var.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(u75Var.readInt64());
                    break;
                case 4:
                    objValueOf = Long.valueOf(u75Var.readUInt64());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(u75Var.readInt32());
                    break;
                case 6:
                    objValueOf = Long.valueOf(u75Var.readFixed64());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(u75Var.readFixed32());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(u75Var.readBool());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(u75Var.readUInt32());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(u75Var.readSFixed32());
                    break;
                case 11:
                    objValueOf = Long.valueOf(u75Var.readSFixed64());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(u75Var.readSInt32());
                    break;
                case 13:
                    objValueOf = Long.valueOf(u75Var.readSInt64());
                    break;
                case 14:
                    qp2.n("Shouldn't reach here.");
                    return null;
                case 15:
                    objValueOf = u75Var.readBytes();
                    break;
                case 16:
                    objValueOf = u75Var.readString();
                    break;
                case 17:
                    if (!eVar.isRepeated()) {
                        Object field2 = f09Var.getField(eVar.descriptor);
                        if (field2 instanceof gv9) {
                            gv9 gv9Var = (gv9) field2;
                            ani aniVarSchemaFor = x6h.getInstance().schemaFor((x6h) gv9Var);
                            if (!gv9Var.isMutable()) {
                                Object objNewInstance = aniVarSchemaFor.newInstance();
                                aniVarSchemaFor.mergeFrom(objNewInstance, field2);
                                f09Var.setField(eVar.descriptor, objNewInstance);
                                field2 = objNewInstance;
                            }
                            u75Var.mergeGroupField(field2, aniVarSchemaFor, yk8Var);
                            return ub;
                        }
                    }
                    objValueOf = u75Var.readGroup(eVar.getMessageDefaultInstance().getClass(), yk8Var);
                    break;
                case 18:
                    if (!eVar.isRepeated()) {
                        Object field3 = f09Var.getField(eVar.descriptor);
                        if (field3 instanceof gv9) {
                            gv9 gv9Var2 = (gv9) field3;
                            ani aniVarSchemaFor2 = x6h.getInstance().schemaFor((x6h) gv9Var2);
                            if (!gv9Var2.isMutable()) {
                                Object objNewInstance2 = aniVarSchemaFor2.newInstance();
                                aniVarSchemaFor2.mergeFrom(objNewInstance2, field3);
                                f09Var.setField(eVar.descriptor, objNewInstance2);
                                field3 = objNewInstance2;
                            }
                            u75Var.mergeMessageField(field3, aniVarSchemaFor2, yk8Var);
                            return ub;
                        }
                    }
                    objValueOf = u75Var.readMessage(eVar.getMessageDefaultInstance().getClass(), yk8Var);
                    break;
            }
        } else {
            int int32 = u75Var.readInt32();
            if (eVar.descriptor.getEnumType().findValueByNumber(int32) == null) {
                return (UB) fni.storeUnknownEnum(obj, number, int32, ub, bmmVar);
            }
            objValueOf = Integer.valueOf(int32);
        }
        if (eVar.isRepeated()) {
            f09Var.addRepeatedField(eVar.descriptor, objValueOf);
            return ub;
        }
        int i = cl8.$SwitchMap$com$google$protobuf$WireFormat$FieldType[eVar.getLiteType().ordinal()];
        if ((i == 17 || i == 18) && (field = f09Var.getField(eVar.descriptor)) != null) {
            objValueOf = ifb.mergeMessage(field, objValueOf);
        }
        f09Var.setField(eVar.descriptor, objValueOf);
        return ub;
    }

    @Override // defpackage.bl8
    public void parseLengthPrefixedMessageSetItem(u75 u75Var, Object obj, yk8 yk8Var, f09 f09Var) throws bjb.a {
        gv9.e eVar = (gv9.e) obj;
        f09Var.setField(eVar.descriptor, u75Var.readMessage(eVar.getMessageDefaultInstance().getClass(), yk8Var));
    }

    @Override // defpackage.bl8
    public void parseMessageSetItem(v44 v44Var, Object obj, yk8 yk8Var, f09 f09Var) {
        gv9.e eVar = (gv9.e) obj;
        qvd qvdVarNewBuilderForType = eVar.getMessageDefaultInstance().newBuilderForType();
        r75 r75VarNewCodedInput = v44Var.newCodedInput();
        qvdVarNewBuilderForType.mergeFrom(r75VarNewCodedInput, yk8Var);
        f09Var.setField(eVar.descriptor, qvdVarNewBuilderForType.buildPartial());
        r75VarNewCodedInput.checkLastTagWas(0);
    }

    @Override // defpackage.bl8
    public void serializeExtension(a85 a85Var, Map.Entry<?, ?> entry) {
        gv9.d dVar = (gv9.d) entry.getKey();
        if (!dVar.isRepeated()) {
            switch (cl8.$SwitchMap$com$google$protobuf$WireFormat$FieldType[dVar.getLiteType().ordinal()]) {
                case 1:
                    a85Var.writeDouble(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    a85Var.writeFloat(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    a85Var.writeInt64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    a85Var.writeUInt64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    a85Var.writeInt32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    a85Var.writeFixed64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    a85Var.writeFixed32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    a85Var.writeBool(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    a85Var.writeUInt32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    a85Var.writeSFixed32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    a85Var.writeSFixed64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    a85Var.writeSInt32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    a85Var.writeSInt64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    a85Var.writeInt32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    a85Var.writeBytes(dVar.getNumber(), (v44) entry.getValue());
                    break;
                case 16:
                    a85Var.writeString(dVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    a85Var.writeGroup(dVar.getNumber(), entry.getValue(), x6h.getInstance().schemaFor(((gv9) entry.getValue()).getClass()));
                    break;
                case 18:
                    a85Var.writeMessage(dVar.getNumber(), entry.getValue(), x6h.getInstance().schemaFor(((gv9) entry.getValue()).getClass()));
                    break;
            }
        }
        switch (cl8.$SwitchMap$com$google$protobuf$WireFormat$FieldType[dVar.getLiteType().ordinal()]) {
            case 1:
                fni.writeDoubleList(dVar.getNumber(), (List) entry.getValue(), a85Var, dVar.isPacked());
                break;
            case 2:
                fni.writeFloatList(dVar.getNumber(), (List) entry.getValue(), a85Var, dVar.isPacked());
                break;
            case 3:
                fni.writeInt64List(dVar.getNumber(), (List) entry.getValue(), a85Var, dVar.isPacked());
                break;
            case 4:
                fni.writeUInt64List(dVar.getNumber(), (List) entry.getValue(), a85Var, dVar.isPacked());
                break;
            case 5:
                fni.writeInt32List(dVar.getNumber(), (List) entry.getValue(), a85Var, dVar.isPacked());
                break;
            case 6:
                fni.writeFixed64List(dVar.getNumber(), (List) entry.getValue(), a85Var, dVar.isPacked());
                break;
            case 7:
                fni.writeFixed32List(dVar.getNumber(), (List) entry.getValue(), a85Var, dVar.isPacked());
                break;
            case 8:
                fni.writeBoolList(dVar.getNumber(), (List) entry.getValue(), a85Var, dVar.isPacked());
                break;
            case 9:
                fni.writeUInt32List(dVar.getNumber(), (List) entry.getValue(), a85Var, dVar.isPacked());
                break;
            case 10:
                fni.writeSFixed32List(dVar.getNumber(), (List) entry.getValue(), a85Var, dVar.isPacked());
                break;
            case 11:
                fni.writeSFixed64List(dVar.getNumber(), (List) entry.getValue(), a85Var, dVar.isPacked());
                break;
            case 12:
                fni.writeSInt32List(dVar.getNumber(), (List) entry.getValue(), a85Var, dVar.isPacked());
                break;
            case 13:
                fni.writeSInt64List(dVar.getNumber(), (List) entry.getValue(), a85Var, dVar.isPacked());
                break;
            case 14:
                fni.writeInt32List(dVar.getNumber(), (List) entry.getValue(), a85Var, dVar.isPacked());
                break;
            case 15:
                fni.writeBytesList(dVar.getNumber(), (List) entry.getValue(), a85Var);
                break;
            case 16:
                fni.writeStringList(dVar.getNumber(), (List) entry.getValue(), a85Var);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    fni.writeGroupList(dVar.getNumber(), (List) entry.getValue(), a85Var, x6h.getInstance().schemaFor(((gv9) list.get(0)).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    fni.writeMessageList(dVar.getNumber(), (List) entry.getValue(), a85Var, x6h.getInstance().schemaFor(((gv9) list2.get(0)).getClass()));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.bl8
    public void setExtensions(Object obj, f09 f09Var) {
        ((gv9.c) obj).extensions = f09Var;
    }
}
