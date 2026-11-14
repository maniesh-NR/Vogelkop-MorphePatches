package defpackage;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class iep extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ oio u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iep(oio oioVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.u = oioVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        oio oioVar = this.u;
        switch (b) {
            case 0:
                return new iep(oioVar, mt5Var, (byte) 0);
            default:
                return new iep(oioVar, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) throws IOException {
        mgp mgpVar;
        byte b = this.t;
        Object obj2 = null;
        oio oioVar = this.u;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                pfp.b();
                File file = oioVar.b;
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    CRC32 crc32 = new CRC32();
                    DataInputStream dataInputStream = new DataInputStream(new CheckedInputStream(new BufferedInputStream(fileInputStream, 8192), crc32));
                    try {
                        int i = dataInputStream.readInt();
                        if (i == 1) {
                            mgpVar = mgp.b;
                        } else {
                            if (i != 2) {
                                throw new g65("Unknown version " + i + ", current: 2");
                            }
                            byte b2 = dataInputStream.readByte();
                            h58 h58Var = mgp.d;
                            h58Var.getClass();
                            w4 w4Var = new w4(h58Var, (byte) 0);
                            while (true) {
                                if (w4Var.hasNext()) {
                                    Object next = w4Var.next();
                                    if (((mgp) next).a == b2) {
                                        obj2 = next;
                                    }
                                }
                            }
                            mgpVar = (mgp) obj2;
                            if (mgpVar == null) {
                                throw new g65("Bad transformer mode: " + ((int) b2));
                            }
                        }
                        try {
                            try {
                                Object objInvoke = oioVar.f.invoke(mgpVar.d(new fxo(dataInputStream, ((file.length() - 4) - (i != 1 ? 1 : 0)) - 8)));
                                long value = crc32.getValue();
                                long j = dataInputStream.readLong();
                                if (j == value) {
                                    dataInputStream.read();
                                    dataInputStream.close();
                                    fileInputStream.close();
                                    return objInvoke;
                                }
                                throw new g65("Bad content cksum: " + value + ", expected: " + j);
                            } catch (o2j e) {
                                throw new g65(e.getMessage());
                            }
                        } catch (IllegalArgumentException e2) {
                            throw new g65(e2.getMessage());
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        vtp.v(fileInputStream, th);
                        throw th2;
                    }
                }
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                File file2 = oioVar.b;
                file2.delete();
                if (!file2.exists()) {
                    return Unit.a;
                }
                s49.m("Failed to remove target file");
                return null;
        }
    }
}
