package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public abstract class u2d {
    public static final HashMap a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final byte[] c = {80, 75, 3, 4};

    public static n3d a(final String str, Callable callable, Runnable runnable) {
        p2d p2dVarA = str == null ? null : q2d.b.a(str);
        final byte b2 = 0;
        n3d n3dVar = p2dVarA != null ? new n3d(new ce2(p2dVarA, (byte) 4), false) : null;
        HashMap map = a;
        if (str != null && map.containsKey(str)) {
            n3dVar = (n3d) map.get(str);
        }
        if (n3dVar != null) {
            if (runnable != null) {
                runnable.run();
            }
            return n3dVar;
        }
        n3d n3dVar2 = new n3d(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            n3dVar2.b(new j3d() { // from class: t2d
                @Override // defpackage.j3d
                public final void onResult(Object obj) {
                    byte b3 = b2;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (b3) {
                        case 0:
                            HashMap map2 = u2d.a;
                            map2.remove(str2);
                            atomicBoolean2.set(true);
                            if (map2.size() == 0) {
                                u2d.i();
                                break;
                            }
                            break;
                        default:
                            HashMap map3 = u2d.a;
                            map3.remove(str2);
                            atomicBoolean2.set(true);
                            if (map3.size() == 0) {
                                u2d.i();
                                break;
                            }
                            break;
                    }
                }
            });
            final byte b3 = 1;
            n3dVar2.a(new j3d() { // from class: t2d
                @Override // defpackage.j3d
                public final void onResult(Object obj) {
                    byte b32 = b3;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (b32) {
                        case 0:
                            HashMap map2 = u2d.a;
                            map2.remove(str2);
                            atomicBoolean2.set(true);
                            if (map2.size() == 0) {
                                u2d.i();
                                break;
                            }
                            break;
                        default:
                            HashMap map3 = u2d.a;
                            map3.remove(str2);
                            atomicBoolean2.set(true);
                            if (map3.size() == 0) {
                                u2d.i();
                                break;
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, n3dVar2);
                if (map.size() == 1) {
                    i();
                }
            }
        }
        return n3dVar2;
    }

    public static l3d b(Context context, String str, String str2) {
        p2d p2dVarA = str2 == null ? null : q2d.b.a(str2);
        if (p2dVarA != null) {
            return new l3d(p2dVarA);
        }
        try {
            return (str.endsWith(".zip") || str.endsWith(".lottie")) ? g(context, new ZipInputStream(context.getAssets().open(str)), str2) : c(context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new l3d((Throwable) e);
        }
    }

    public static l3d c(InputStream inputStream, String str) {
        tlh tlhVar = new tlh(o0g.A0(inputStream));
        String[] strArr = esb.e;
        return d(new vsb(tlhVar), str, true);
    }

    public static l3d d(vsb vsbVar, String str, boolean z) throws IOException {
        p2d p2dVarA;
        l3d l3dVar;
        try {
            if (str == null) {
                p2dVarA = null;
            } else {
                try {
                    p2dVarA = q2d.b.a(str);
                } catch (Exception e) {
                    l3d l3dVar2 = new l3d((Throwable) e);
                    if (z) {
                        dzm.b(vsbVar);
                    }
                    return l3dVar2;
                }
            }
            if (p2dVarA == null) {
                p2d p2dVarA2 = v2d.a(vsbVar);
                if (str != null) {
                    q2d.b.a.put(str, p2dVarA2);
                }
                l3dVar = new l3d(p2dVarA2);
                if (z) {
                }
                return l3dVar;
            }
            l3dVar = new l3d(p2dVarA);
            if (!z) {
                return l3dVar;
            }
            dzm.b(vsbVar);
            return l3dVar;
        } catch (Throwable th) {
            if (z) {
                dzm.b(vsbVar);
            }
            throw th;
        }
    }

    public static n3d e(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return a(str, new Callable() { // from class: s2d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return u2d.f(context2, i, str);
            }
        }, null);
    }

    public static l3d f(Context context, int i, String str) {
        Boolean bool;
        p2d p2dVarA = str == null ? null : q2d.b.a(str);
        if (p2dVarA != null) {
            return new l3d(p2dVarA);
        }
        try {
            tlh tlhVar = new tlh(o0g.A0(context.getResources().openRawResource(i)));
            try {
                try {
                    tlh tlhVarPeek = tlhVar.peek();
                    byte[] bArr = c;
                    int length = bArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            tlhVarPeek.close();
                            bool = Boolean.TRUE;
                            break;
                        }
                        if (tlhVarPeek.readByte() != bArr[i2]) {
                            bool = Boolean.FALSE;
                            break;
                        }
                        i2++;
                    }
                } catch (NoSuchMethodError unused) {
                    bool = Boolean.FALSE;
                }
            } catch (Exception unused2) {
                izc.a.getClass();
                bool = Boolean.FALSE;
            }
            return bool.booleanValue() ? g(context, new ZipInputStream(new jk3(tlhVar, (byte) 3)), str) : c(new jk3(tlhVar, (byte) 3), str);
        } catch (Resources.NotFoundException e) {
            return new l3d((Throwable) e);
        }
    }

    public static l3d g(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        try {
            return h(context, zipInputStream, str);
        } finally {
            dzm.b(zipInputStream);
        }
    }

    public static l3d h(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        p2d p2dVarA;
        h3d h3dVar;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            p2dVarA = null;
        } else {
            try {
                p2dVarA = q2d.b.a(str);
            } catch (IOException e) {
                return new l3d((Throwable) e);
            }
        }
        if (p2dVarA != null) {
            return new l3d(p2dVarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        p2d p2dVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                tlh tlhVar = new tlh(o0g.A0(zipInputStream));
                String[] strArr = esb.e;
                p2dVar = (p2d) d(new vsb(tlhVar), null, false).a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                File file = new File(context.getCacheDir(), str2);
                new FileOutputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i = zipInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable unused) {
                    izc.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ");
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    izc.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (p2dVar == null) {
            return new l3d((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = p2dVar.d.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    h3dVar = null;
                    break;
                }
                h3dVar = (h3d) it.next();
                if (h3dVar.c.equals(str4)) {
                    break;
                }
            }
            if (h3dVar != null) {
                h3dVar.d = dzm.e((Bitmap) entry.getValue(), h3dVar.a, h3dVar.b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (ih9 ih9Var : p2dVar.e.values()) {
                if (ih9Var.a.equals(entry2.getKey())) {
                    ih9Var.c = (Typeface) entry2.getValue();
                    z = true;
                }
            }
            if (!z) {
                izc.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = p2dVar.d.entrySet().iterator();
            while (it2.hasNext()) {
                h3d h3dVar2 = (h3d) ((Map.Entry) it2.next()).getValue();
                if (h3dVar2 == null) {
                    return null;
                }
                String str5 = h3dVar2.c;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        h3dVar2.d = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                    } catch (IllegalArgumentException unused2) {
                        izc.c("data URL did not have correct base64 format.");
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            q2d.b.a.put(str, p2dVar);
        }
        return new l3d(p2dVar);
    }

    public static void i() {
        ArrayList arrayList = new ArrayList(b);
        if (arrayList.size() > 0) {
            throw fki.n(0, arrayList);
        }
    }

    public static String j(int i, Context context) {
        return rfp.n(i, (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }
}
