package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class pkg {
    public final ArrayList a = new ArrayList();
    public int b;
    public long c;

    public static pkg a(DataInputStream dataInputStream) throws IOException {
        pkg pkgVar = new pkg();
        dataInputStream.readInt();
        int i = dataInputStream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            dataInputStream.readInt();
            long j = dataInputStream.readLong();
            String utf = null;
            String utf2 = dataInputStream.readBoolean() ? dataInputStream.readUTF() : null;
            if (dataInputStream.readBoolean()) {
                utf = dataInputStream.readUTF();
            }
            pkgVar.a.add(new dgd(utf2, dataInputStream.readInt(), utf, j));
        }
        pkgVar.b = dataInputStream.readInt();
        pkgVar.c = dataInputStream.readLong();
        return pkgVar;
    }

    public final void b(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(1);
        ArrayList arrayList = this.a;
        dataOutputStream.writeInt(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            dgd dgdVar = (dgd) obj;
            dgdVar.getClass();
            dataOutputStream.writeInt(1);
            dataOutputStream.writeLong(dgdVar.a);
            String str = dgdVar.b;
            if (str == null) {
                dataOutputStream.writeBoolean(false);
            } else {
                dataOutputStream.writeBoolean(true);
                dataOutputStream.writeUTF(str.toString());
            }
            String str2 = dgdVar.c;
            if (str2 == null) {
                dataOutputStream.writeBoolean(false);
            } else {
                dataOutputStream.writeBoolean(true);
                dataOutputStream.writeUTF(str2.toString());
            }
            dataOutputStream.writeInt(dgdVar.d);
        }
        dataOutputStream.writeInt(this.b);
        dataOutputStream.writeLong(this.c);
    }
}
