package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.res.Resources;
import android.media.AudioAttributes;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class ws4 {
    public static final Set e = Collections.synchronizedSet(new HashSet());
    public static final Set f = Collections.synchronizedSet(new HashSet());
    public final wub a;
    public final Resources b;
    public final ArrayDeque c = new ArrayDeque();
    public boolean d;

    public ws4(wub wubVar, Resources resources) {
        this.a = wubVar;
        this.b = resources;
    }

    public final void a() {
        HashSet hashSet = new HashSet();
        Iterator it = yjf.b.iterator();
        while (it.hasNext()) {
            ((rr4) yjf.a.get((String) it.next())).getClass();
            hashSet.add("general");
        }
        c(hashSet, yjf.b);
    }

    public final void b() {
        if (this.d) {
            return;
        }
        ArrayDeque arrayDeque = this.c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.d = true;
        ((Runnable) arrayDeque.remove()).run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Collection collection, Collection collection2) {
        Resources resources;
        Set set;
        wub wubVar;
        rr4 rr4Var;
        sr4 sr4Var;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = collection.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            resources = this.b;
            set = f;
            if (!zHasNext) {
                break;
            }
            String str = (String) it.next();
            if (!set.contains(str) && (sr4Var = (sr4) xjf.a.get(str)) != null) {
                NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(sr4Var.a, resources.getString(sr4Var.b));
                map.put(notificationChannelGroup.getId(), notificationChannelGroup);
            }
        }
        Iterator it2 = collection2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            Set set2 = e;
            if (!zHasNext2) {
                Iterator it3 = map.values().iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    wubVar = this.a;
                    if (!zHasNext3) {
                        break;
                    }
                    NotificationChannelGroup notificationChannelGroup2 = (NotificationChannelGroup) it3.next();
                    wubVar.y(notificationChannelGroup2);
                    set.add(notificationChannelGroup2.getId());
                }
                for (NotificationChannel notificationChannel : map2.values()) {
                    wubVar.x(notificationChannel);
                    set2.add(notificationChannel.getId());
                }
                return;
            }
            String str2 = (String) it2.next();
            if (!set2.contains(str2)) {
                if (n9h.n(str2)) {
                    rr4Var = null;
                } else {
                    rr4Var = (rr4) yjf.a.get(str2);
                    if (rr4Var == null) {
                        qp2.n("Could not initialize channel: ".concat(str2));
                        return;
                    }
                }
                if (rr4Var != null) {
                    sr4 sr4Var2 = (sr4) xjf.a.get("general");
                    NotificationChannelGroup notificationChannelGroup3 = new NotificationChannelGroup(sr4Var2.a, resources.getString(sr4Var2.b));
                    NotificationChannel notificationChannel2 = new NotificationChannel(rr4Var.a, resources.getString(rr4Var.b), rr4Var.c);
                    notificationChannel2.setGroup("general");
                    notificationChannel2.setShowBadge(rr4Var.d);
                    boolean z = rr4Var.f;
                    if (z != -1000) {
                        notificationChannel2.setLockscreenVisibility(z ? 1 : 0);
                    }
                    notificationChannel2.enableVibration(rr4Var.g);
                    notificationChannel2.enableLights(rr4Var.h);
                    if (rr4Var.e) {
                        notificationChannel2.setSound(null, new AudioAttributes.Builder().setContentType(4).setUsage(5).build());
                    }
                    if (!set.contains(notificationChannelGroup3.getId())) {
                        map.put(notificationChannelGroup3.getId(), notificationChannelGroup3);
                    }
                    map2.put(notificationChannel2.getId(), notificationChannel2);
                }
            }
        }
    }
}
