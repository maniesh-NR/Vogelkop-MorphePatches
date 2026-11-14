package defpackage;

import android.content.Context;
import com.opera.android.browser.b;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class wun {
    public final Context a;
    public final umi b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ko7 g;

    public wun(Context context, umi umiVar) {
        this.a = context.getApplicationContext();
        this.b = umiVar;
        ko7 ko7Var = new ko7(this, umiVar);
        this.g = ko7Var;
        ko7Var.h();
    }

    public final uun a(String str, p6l p6lVar, zun zunVar) {
        vun vunVar;
        uun uunVar = new uun(zunVar);
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                ArrayList arrayList2 = this.e;
                int size2 = arrayList2.size();
                while (true) {
                    if (i >= size2) {
                        vunVar = new vun(str, p6lVar);
                        arrayList2.add(vunVar);
                        break;
                    }
                    Object obj = arrayList2.get(i);
                    i++;
                    vunVar = (vun) obj;
                    if (vunVar.a.equals(str) && vunVar.b.equals(p6lVar)) {
                        break;
                    }
                }
            } else {
                Object obj2 = arrayList.get(i2);
                i2++;
                vunVar = (vun) obj2;
                if (vunVar.a.equals(str) && vunVar.b.equals(p6lVar)) {
                    break;
                }
            }
        }
        vunVar.c.add(uunVar);
        c();
        return uunVar;
    }

    public final tun b(String str, p6l p6lVar) {
        if (p6lVar != p6l.a) {
            return (tun) this.d.get(str);
        }
        this.g.i();
        return (tun) this.c.get(str);
    }

    public final void c() {
        o00 o00Var = new o00((byte) 12);
        ArrayList arrayList = this.e;
        sfe.A0(arrayList, o00Var);
        ArrayList arrayList2 = this.f;
        if (arrayList2.size() >= 2 || arrayList.isEmpty()) {
            return;
        }
        vun vunVar = (vun) arrayList.remove(0);
        arrayList2.add(vunVar);
        new b(this.b, vunVar.a, vunVar.b, new qsh((byte) 11, this, vunVar, false), true);
    }

    public final void d() {
        byte[] byteArray;
        LinkedHashMap linkedHashMap = this.c;
        ko7 ko7Var = this.g;
        ko7Var.i();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(1);
            int iMin = Math.min(linkedHashMap.size(), 100);
            int size = linkedHashMap.size() - iMin;
            dataOutputStream.writeInt(iMin);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (size > 0) {
                    size--;
                } else {
                    dataOutputStream.writeUTF((String) entry.getKey());
                    ((tun) entry.getValue()).g(dataOutputStream);
                }
            }
            xvg.l(dataOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            xvg.l(dataOutputStream);
            byteArray = null;
        } catch (Throwable th) {
            xvg.l(dataOutputStream);
            throw th;
        }
        ko7Var.g(byteArray);
    }
}
