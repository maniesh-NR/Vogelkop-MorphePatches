package defpackage;

import android.text.TextUtils;
import com.leanplum.internal.Constants;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class tun {
    public final String a;
    public final List b;

    public tun(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public static tun f(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        if (i != 1) {
            s49.m(p3p.i(i, "Unhandled version ", ", expected 1"));
            return null;
        }
        String utf = dataInputStream.readUTF();
        int i2 = dataInputStream.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = dataInputStream.readInt();
            HashMap map = new HashMap();
            for (int i5 = 0; i5 < i4; i5++) {
                map.put(dataInputStream.readUTF(), dataInputStream.readUTF());
            }
            arrayList.add(map);
        }
        return new tun(utf, arrayList);
    }

    public final String a() {
        String strB = b("og:description");
        if (!TextUtils.isEmpty(strB)) {
            return strB;
        }
        String strB2 = b("twitter:description");
        if (!TextUtils.isEmpty(strB2)) {
            return strB2;
        }
        String strB3 = b("description");
        if (TextUtils.isEmpty(strB3)) {
            return null;
        }
        return strB3;
    }

    public final String b(String str) {
        for (Map map : this.b) {
            String str2 = (String) map.get("property");
            if (str2 == null) {
                str2 = (String) map.get(Constants.Params.NAME);
            }
            String str3 = (String) map.get("content");
            if (str2 != null && str3 != null && str2.equalsIgnoreCase(str)) {
                return str3.trim();
            }
        }
        return null;
    }

    public final String c() {
        String strB = b("og:image:secure_url");
        if (!TextUtils.isEmpty(strB)) {
            return strB;
        }
        String strB2 = b("og:image:url");
        if (!TextUtils.isEmpty(strB2)) {
            return strB2;
        }
        String strB3 = b("og:image");
        if (!TextUtils.isEmpty(strB3)) {
            return strB3;
        }
        String strB4 = b("twitter:image");
        if (!TextUtils.isEmpty(strB4)) {
            return strB4;
        }
        String strB5 = b("thumbnail");
        if (TextUtils.isEmpty(strB5)) {
            return null;
        }
        return strB5;
    }

    public final String d() {
        String strB;
        if ("website".equals(b("og:type")) && (strB = b("og:site_name")) != null) {
            return strB;
        }
        String strE = e();
        return !TextUtils.isEmpty(strE) ? strE : b("og:site_name");
    }

    public final String e() {
        String strB = b("og:title");
        if (!TextUtils.isEmpty(strB)) {
            return strB;
        }
        String strB2 = b("twitter:title");
        return !TextUtils.isEmpty(strB2) ? strB2 : this.a;
    }

    public final void g(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(1);
        dataOutputStream.writeUTF(this.a);
        Iterator itV = vep.v(this.b, dataOutputStream);
        while (itV.hasNext()) {
            Iterator itU = vep.u(dataOutputStream, (Map) itV.next());
            while (itU.hasNext()) {
                Map.Entry entry = (Map.Entry) itU.next();
                dataOutputStream.writeUTF((String) entry.getKey());
                dataOutputStream.writeUTF((String) entry.getValue());
            }
        }
    }
}
