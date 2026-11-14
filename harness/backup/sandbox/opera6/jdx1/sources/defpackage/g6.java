package defpackage;

import defpackage.w5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class g6 implements p1g {
    private static final yk8 EMPTY_REGISTRY = yk8.getEmptyRegistry();

    private rvd checkMessageInitialized(rvd rvdVar) throws bjb {
        if (rvdVar == null || rvdVar.isInitialized()) {
            return rvdVar;
        }
        throw newUninitializedMessageException(rvdVar).asInvalidProtocolBufferException().setUnfinishedMessage(rvdVar);
    }

    private zkm newUninitializedMessageException(rvd rvdVar) {
        return rvdVar instanceof w5 ? ((w5) rvdVar).newUninitializedMessageException() : new zkm(rvdVar);
    }

    @Override // defpackage.p1g
    public rvd parseDelimitedFrom(InputStream inputStream) {
        return parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // defpackage.p1g
    public rvd parseDelimitedFrom(InputStream inputStream, yk8 yk8Var) {
        return checkMessageInitialized(parsePartialDelimitedFrom(inputStream, yk8Var));
    }

    @Override // defpackage.p1g
    public rvd parseFrom(InputStream inputStream) {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // defpackage.p1g
    public rvd parseFrom(InputStream inputStream, yk8 yk8Var) {
        return checkMessageInitialized(parsePartialFrom(inputStream, yk8Var));
    }

    @Override // defpackage.p1g
    public rvd parseFrom(ByteBuffer byteBuffer) {
        return parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    @Override // defpackage.p1g
    public rvd parseFrom(ByteBuffer byteBuffer, yk8 yk8Var) throws bjb {
        r75 r75VarNewInstance = r75.newInstance(byteBuffer);
        rvd rvdVar = (rvd) parsePartialFrom(r75VarNewInstance, yk8Var);
        try {
            r75VarNewInstance.checkLastTagWas(0);
            return checkMessageInitialized(rvdVar);
        } catch (bjb e) {
            throw e.setUnfinishedMessage(rvdVar);
        }
    }

    @Override // defpackage.p1g
    public rvd parseFrom(r75 r75Var) {
        return parseFrom(r75Var, EMPTY_REGISTRY);
    }

    @Override // defpackage.p1g
    public rvd parseFrom(r75 r75Var, yk8 yk8Var) {
        return checkMessageInitialized((rvd) parsePartialFrom(r75Var, yk8Var));
    }

    @Override // defpackage.p1g
    public rvd parseFrom(v44 v44Var) {
        return parseFrom(v44Var, EMPTY_REGISTRY);
    }

    @Override // defpackage.p1g
    public rvd parseFrom(v44 v44Var, yk8 yk8Var) {
        return checkMessageInitialized(parsePartialFrom(v44Var, yk8Var));
    }

    @Override // defpackage.p1g
    public rvd parseFrom(byte[] bArr) {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // defpackage.p1g
    public rvd parseFrom(byte[] bArr, int i, int i2) {
        return parseFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // defpackage.p1g
    public rvd parseFrom(byte[] bArr, int i, int i2, yk8 yk8Var) {
        return checkMessageInitialized(parsePartialFrom(bArr, i, i2, yk8Var));
    }

    @Override // defpackage.p1g
    public rvd parseFrom(byte[] bArr, yk8 yk8Var) {
        return parseFrom(bArr, 0, bArr.length, yk8Var);
    }

    @Override // defpackage.p1g
    public rvd parsePartialDelimitedFrom(InputStream inputStream) {
        return parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // defpackage.p1g
    public rvd parsePartialDelimitedFrom(InputStream inputStream, yk8 yk8Var) throws IOException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            return parsePartialFrom((InputStream) new w5.a.C0001a(inputStream, r75.readRawVarint32(i, inputStream)), yk8Var);
        } catch (IOException e) {
            throw new bjb(e);
        }
    }

    @Override // defpackage.p1g
    public abstract /* synthetic */ Object parsePartialFrom(r75 r75Var, yk8 yk8Var);

    @Override // defpackage.p1g
    public rvd parsePartialFrom(InputStream inputStream) {
        return parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // defpackage.p1g
    public rvd parsePartialFrom(InputStream inputStream, yk8 yk8Var) throws bjb {
        r75 r75VarNewInstance = r75.newInstance(inputStream);
        rvd rvdVar = (rvd) parsePartialFrom(r75VarNewInstance, yk8Var);
        try {
            r75VarNewInstance.checkLastTagWas(0);
            return rvdVar;
        } catch (bjb e) {
            throw e.setUnfinishedMessage(rvdVar);
        }
    }

    @Override // defpackage.p1g
    public rvd parsePartialFrom(r75 r75Var) {
        return (rvd) parsePartialFrom(r75Var, EMPTY_REGISTRY);
    }

    @Override // defpackage.p1g
    public rvd parsePartialFrom(v44 v44Var) {
        return parsePartialFrom(v44Var, EMPTY_REGISTRY);
    }

    @Override // defpackage.p1g
    public rvd parsePartialFrom(v44 v44Var, yk8 yk8Var) throws bjb {
        r75 r75VarNewCodedInput = v44Var.newCodedInput();
        rvd rvdVar = (rvd) parsePartialFrom(r75VarNewCodedInput, yk8Var);
        try {
            r75VarNewCodedInput.checkLastTagWas(0);
            return rvdVar;
        } catch (bjb e) {
            throw e.setUnfinishedMessage(rvdVar);
        }
    }

    @Override // defpackage.p1g
    public rvd parsePartialFrom(byte[] bArr) {
        return parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    @Override // defpackage.p1g
    public rvd parsePartialFrom(byte[] bArr, int i, int i2) {
        return parsePartialFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // defpackage.p1g
    public rvd parsePartialFrom(byte[] bArr, int i, int i2, yk8 yk8Var) throws bjb {
        r75 r75VarNewInstance = r75.newInstance(bArr, i, i2);
        rvd rvdVar = (rvd) parsePartialFrom(r75VarNewInstance, yk8Var);
        try {
            r75VarNewInstance.checkLastTagWas(0);
            return rvdVar;
        } catch (bjb e) {
            throw e.setUnfinishedMessage(rvdVar);
        }
    }

    @Override // defpackage.p1g
    public rvd parsePartialFrom(byte[] bArr, yk8 yk8Var) {
        return parsePartialFrom(bArr, 0, bArr.length, yk8Var);
    }
}
