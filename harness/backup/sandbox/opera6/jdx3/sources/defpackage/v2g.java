package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.chromium.base.Callback;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v2g extends t2g {
    public final kqd b;

    public v2g(String str, String str2, x2g x2gVar, kqd kqdVar) {
        super(str2, x2gVar, sko.k("https://", str, "/v1/tree"));
        this.b = kqdVar;
        final byte b = 0;
        final byte b2 = 1;
        this.a.b(false, new Callback(this) { // from class: u2g
            public final /* synthetic */ v2g b;

            {
                this.b = this;
            }

            @Override // org.chromium.base.Callback
            /* renamed from: onResult */
            public final void c(Object obj) {
                byte b3 = b;
                v2g v2gVar = this.b;
                switch (b3) {
                    case 0:
                        kqd kqdVar2 = v2gVar.b;
                        byte[] bArr = (byte[]) obj;
                        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
                        try {
                            try {
                                int i = dataInputStream.readInt();
                                if (i < 0) {
                                    x79 x79Var = (x79) kqdVar2.b;
                                    x79Var.c = null;
                                    x79Var.T(false);
                                } else {
                                    dataInputStream.skipBytes(i);
                                    int i2 = dataInputStream.readInt();
                                    if (i2 < 0) {
                                        x79 x79Var2 = (x79) kqdVar2.b;
                                        x79Var2.c = null;
                                        x79Var2.T(false);
                                    } else {
                                        dataInputStream.skipBytes(i2);
                                        int i3 = i + 8 + i2;
                                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i3);
                                        JSONObject jSONObject = new JSONObject(new String(Arrays.copyOfRange(bArr, i3, bArr.length)));
                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                        long millis = TimeUnit.MINUTES.toMillis(jSONObject.getInt("ttl")) + jCurrentTimeMillis;
                                        JSONArray jSONArray = jSONObject.getJSONArray("sites");
                                        ArrayList arrayList = new ArrayList();
                                        int length = jSONArray.length();
                                        for (int i4 = 0; i4 < length; i4++) {
                                            arrayList.add(t2g.a(new orb(jSONArray.getJSONObject(i4)), jCurrentTimeMillis, millis));
                                        }
                                        c3g c3gVar = new c3g(jCurrentTimeMillis, bArrCopyOfRange, millis);
                                        x79 x79Var3 = (x79) kqdVar2.b;
                                        x79Var3.c = null;
                                        x79Var3.d = c3gVar;
                                        x79Var3.e = arrayList;
                                        x79Var3.T(true);
                                    }
                                }
                            } catch (IOException | JSONException e) {
                                e.toString();
                                x79 x79Var4 = (x79) kqdVar2.b;
                                x79Var4.c = null;
                                x79Var4.T(false);
                            }
                            return;
                        } finally {
                            xvg.l(dataInputStream);
                        }
                    default:
                        x79 x79Var5 = (x79) v2gVar.b.b;
                        x79Var5.c = null;
                        x79Var5.T(false);
                        return;
                }
            }
        }, new Callback(this) { // from class: u2g
            public final /* synthetic */ v2g b;

            {
                this.b = this;
            }

            @Override // org.chromium.base.Callback
            /* renamed from: onResult */
            public final void c(Object obj) {
                byte b3 = b2;
                v2g v2gVar = this.b;
                switch (b3) {
                    case 0:
                        kqd kqdVar2 = v2gVar.b;
                        byte[] bArr = (byte[]) obj;
                        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
                        try {
                            try {
                                int i = dataInputStream.readInt();
                                if (i < 0) {
                                    x79 x79Var = (x79) kqdVar2.b;
                                    x79Var.c = null;
                                    x79Var.T(false);
                                } else {
                                    dataInputStream.skipBytes(i);
                                    int i2 = dataInputStream.readInt();
                                    if (i2 < 0) {
                                        x79 x79Var2 = (x79) kqdVar2.b;
                                        x79Var2.c = null;
                                        x79Var2.T(false);
                                    } else {
                                        dataInputStream.skipBytes(i2);
                                        int i3 = i + 8 + i2;
                                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i3);
                                        JSONObject jSONObject = new JSONObject(new String(Arrays.copyOfRange(bArr, i3, bArr.length)));
                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                        long millis = TimeUnit.MINUTES.toMillis(jSONObject.getInt("ttl")) + jCurrentTimeMillis;
                                        JSONArray jSONArray = jSONObject.getJSONArray("sites");
                                        ArrayList arrayList = new ArrayList();
                                        int length = jSONArray.length();
                                        for (int i4 = 0; i4 < length; i4++) {
                                            arrayList.add(t2g.a(new orb(jSONArray.getJSONObject(i4)), jCurrentTimeMillis, millis));
                                        }
                                        c3g c3gVar = new c3g(jCurrentTimeMillis, bArrCopyOfRange, millis);
                                        x79 x79Var3 = (x79) kqdVar2.b;
                                        x79Var3.c = null;
                                        x79Var3.d = c3gVar;
                                        x79Var3.e = arrayList;
                                        x79Var3.T(true);
                                    }
                                }
                            } catch (IOException | JSONException e) {
                                e.toString();
                                x79 x79Var4 = (x79) kqdVar2.b;
                                x79Var4.c = null;
                                x79Var4.T(false);
                            }
                            return;
                        } finally {
                            xvg.l(dataInputStream);
                        }
                    default:
                        x79 x79Var5 = (x79) v2gVar.b.b;
                        x79Var5.c = null;
                        x79Var5.T(false);
                        return;
                }
            }
        });
    }
}
