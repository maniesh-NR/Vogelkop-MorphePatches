package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.leanplum.internal.Constants;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class qag implements CookieStore {
    public static final Handler f = new Handler(Looper.getMainLooper());
    public final i32 b;
    public final short e;
    public final HashMap a = new HashMap();
    public final vdf c = new vdf(this, (byte) 25);
    public final Object d = new Object();

    public qag(umi umiVar, Context context, String str) {
        i32 i32Var = new i32(context, umiVar, str, new o8f(this, (byte) 19));
        this.b = i32Var;
        i32Var.h();
        this.e = (short) 3000;
    }

    public static void d(vpb vpbVar, Set set) throws JSONException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            HttpCookie httpCookie = (HttpCookie) it.next();
            if (httpCookie.getMaxAge() != -1 && !httpCookie.hasExpired()) {
                orb orbVar = new orb();
                orbVar.p(httpCookie.getName(), Constants.Params.NAME);
                orbVar.p(httpCookie.getValue(), Constants.Params.VALUE);
                orbVar.p(httpCookie.getComment(), "comment");
                orbVar.p(httpCookie.getDomain(), "domain");
                orbVar.p(httpCookie.getPath(), "path");
                orbVar.p(httpCookie.getPortlist(), "portlist");
                orbVar.r("discard", httpCookie.getDiscard());
                orbVar.r("secure", httpCookie.getSecure());
                orbVar.n(httpCookie.getVersion(), "version");
                orbVar.o((httpCookie.getMaxAge() * 1000) + System.currentTimeMillis(), "expires");
                vpbVar.a(orbVar);
            }
        }
    }

    public final void a(URI uri, HttpCookie httpCookie) {
        if (uri == null) {
            uri = null;
        } else {
            try {
                uri = new URI("http", uri.getHost(), null, null);
            } catch (URISyntaxException unused) {
            }
        }
        HashMap map = this.a;
        Set hashSet = (Set) map.get(uri);
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(uri, hashSet);
        } else {
            hashSet.remove(httpCookie);
        }
        hashSet.add(httpCookie);
    }

    @Override // java.net.CookieStore
    public final void add(URI uri, HttpCookie httpCookie) throws JSONException, InterruptedException {
        b();
        synchronized (this.d) {
            a(uri, httpCookie);
        }
        e();
    }

    public final void b() throws InterruptedException {
        hd hdVar = this.b.f;
        hdVar.getClass();
        try {
            ((CountDownLatch) hdVar.c).await();
            if (vml.b()) {
                ((oml) hdVar.e).cancel(false);
                hdVar.f();
            }
        } catch (InterruptedException unused) {
        }
    }

    public final void c() throws JSONException, InterruptedException {
        orb orbVar = new orb();
        orb orbVar2 = new orb();
        orbVar.p(orbVar2, "uris");
        b();
        synchronized (this.d) {
            for (Map.Entry entry : this.a.entrySet()) {
                vpb vpbVar = new vpb();
                if (entry.getKey() == null) {
                    orbVar.p(vpbVar, "any");
                } else {
                    orbVar2.p(vpbVar, ((URI) entry.getKey()).toString());
                }
                d(vpbVar, (Set) entry.getValue());
            }
        }
        this.b.g(orbVar);
    }

    public final void e() throws JSONException, InterruptedException {
        long j = this.e;
        if (j < 0) {
            return;
        }
        if (j == 0) {
            c();
            return;
        }
        Handler handler = f;
        vdf vdfVar = this.c;
        handler.removeCallbacks(vdfVar);
        handler.postDelayed(vdfVar, j);
    }

    @Override // java.net.CookieStore
    public final List get(URI uri) throws JSONException, InterruptedException {
        boolean z;
        b();
        HashSet hashSet = new HashSet();
        synchronized (this.d) {
            z = false;
            for (Map.Entry entry : this.a.entrySet()) {
                boolean zEquals = uri.equals(entry.getKey());
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    HttpCookie httpCookie = (HttpCookie) it.next();
                    if (zEquals || HttpCookie.domainMatches(httpCookie.getDomain(), uri.getHost())) {
                        if (httpCookie.hasExpired()) {
                            it.remove();
                            z = true;
                        } else if (!hashSet.contains(httpCookie)) {
                            hashSet.add(httpCookie);
                        }
                    }
                }
            }
        }
        if (z) {
            e();
        }
        return Collections.unmodifiableList(new ArrayList(hashSet));
    }

    @Override // java.net.CookieStore
    public final List getCookies() throws JSONException, InterruptedException {
        boolean z;
        b();
        HashSet hashSet = new HashSet();
        synchronized (this.d) {
            Iterator it = this.a.values().iterator();
            z = false;
            while (it.hasNext()) {
                Iterator it2 = ((Set) it.next()).iterator();
                while (it2.hasNext()) {
                    HttpCookie httpCookie = (HttpCookie) it2.next();
                    if (httpCookie.hasExpired()) {
                        it2.remove();
                        z = true;
                    } else if (!hashSet.contains(httpCookie)) {
                        hashSet.add(httpCookie);
                    }
                }
            }
        }
        if (z) {
            e();
        }
        return Collections.unmodifiableList(new ArrayList(hashSet));
    }

    @Override // java.net.CookieStore
    public final List getURIs() throws InterruptedException {
        List listUnmodifiableList;
        b();
        synchronized (this.d) {
            ArrayList arrayList = new ArrayList(this.a.keySet());
            arrayList.remove((Object) null);
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return listUnmodifiableList;
    }

    @Override // java.net.CookieStore
    public final boolean remove(URI uri, HttpCookie httpCookie) throws JSONException, InterruptedException {
        boolean zRemove;
        b();
        synchronized (this.d) {
            Set set = (Set) this.a.get(uri);
            zRemove = set != null ? set.remove(httpCookie) : false;
        }
        if (zRemove) {
            e();
        }
        return zRemove;
    }

    @Override // java.net.CookieStore
    public final boolean removeAll() {
        b();
        synchronized (this.d) {
            if (this.a.isEmpty()) {
                return false;
            }
            this.a.clear();
            e();
            return true;
        }
    }
}
