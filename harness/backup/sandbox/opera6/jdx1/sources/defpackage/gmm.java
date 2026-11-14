package defpackage;

/* loaded from: classes.dex */
public class gmm extends bmm {
    @Override // defpackage.bmm
    public void addFixed32(dmm dmmVar, int i, int i2) {
        dmmVar.storeField(j4o.makeTag(i, 5), Integer.valueOf(i2));
    }

    @Override // defpackage.bmm
    public void addFixed64(dmm dmmVar, int i, long j) {
        dmmVar.storeField(j4o.makeTag(i, 1), Long.valueOf(j));
    }

    @Override // defpackage.bmm
    public void addGroup(dmm dmmVar, int i, dmm dmmVar2) {
        dmmVar.storeField(j4o.makeTag(i, 3), dmmVar2);
    }

    @Override // defpackage.bmm
    public void addLengthDelimited(dmm dmmVar, int i, v44 v44Var) {
        dmmVar.storeField(j4o.makeTag(i, 2), v44Var);
    }

    @Override // defpackage.bmm
    public void addVarint(dmm dmmVar, int i, long j) {
        dmmVar.storeField(j4o.makeTag(i, 0), Long.valueOf(j));
    }

    @Override // defpackage.bmm
    public dmm getBuilderFromMessage(Object obj) {
        dmm fromMessage = getFromMessage(obj);
        if (fromMessage != dmm.getDefaultInstance()) {
            return fromMessage;
        }
        dmm dmmVarNewInstance = dmm.newInstance();
        setToMessage(obj, dmmVarNewInstance);
        return dmmVarNewInstance;
    }

    @Override // defpackage.bmm
    public dmm getFromMessage(Object obj) {
        return ((gv9) obj).unknownFields;
    }

    @Override // defpackage.bmm
    public int getSerializedSize(dmm dmmVar) {
        return dmmVar.getSerializedSize();
    }

    @Override // defpackage.bmm
    public int getSerializedSizeAsMessageSet(dmm dmmVar) {
        return dmmVar.getSerializedSizeAsMessageSet();
    }

    @Override // defpackage.bmm
    public void makeImmutable(Object obj) {
        getFromMessage(obj).makeImmutable();
    }

    @Override // defpackage.bmm
    public dmm merge(dmm dmmVar, dmm dmmVar2) {
        return dmm.getDefaultInstance().equals(dmmVar2) ? dmmVar : dmm.getDefaultInstance().equals(dmmVar) ? dmm.mutableCopyOf(dmmVar, dmmVar2) : dmmVar.mergeFrom(dmmVar2);
    }

    @Override // defpackage.bmm
    public dmm newBuilder() {
        return dmm.newInstance();
    }

    @Override // defpackage.bmm
    public void setBuilderToMessage(Object obj, dmm dmmVar) {
        setToMessage(obj, dmmVar);
    }

    @Override // defpackage.bmm
    public void setToMessage(Object obj, dmm dmmVar) {
        ((gv9) obj).unknownFields = dmmVar;
    }

    @Override // defpackage.bmm
    public boolean shouldDiscardUnknownFields(u75 u75Var) {
        return false;
    }

    @Override // defpackage.bmm
    public dmm toImmutable(dmm dmmVar) {
        dmmVar.makeImmutable();
        return dmmVar;
    }

    @Override // defpackage.bmm
    public void writeAsMessageSetTo(dmm dmmVar, a85 a85Var) {
        dmmVar.writeAsMessageSetTo(a85Var);
    }

    @Override // defpackage.bmm
    public void writeTo(dmm dmmVar, a85 a85Var) {
        dmmVar.writeTo(a85Var);
    }
}
