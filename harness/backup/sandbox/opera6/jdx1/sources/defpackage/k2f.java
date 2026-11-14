package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k2f implements Handler.Callback, ServiceConnection {
    public final Context a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet d = new HashSet();

    public k2f(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(j2f j2fVar) {
        boolean z;
        ArrayDeque arrayDeque = j2fVar.d;
        ComponentName componentName = j2fVar.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
            arrayDeque.size();
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (j2fVar.b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.a;
            boolean zBindService = context.bindService(component, this, 33);
            j2fVar.b = zBindService;
            if (zBindService) {
                j2fVar.e = 0;
            } else {
                Objects.toString(componentName);
                context.unbindService(this);
            }
            z = j2fVar.b;
        }
        if (!z || j2fVar.c == null) {
            b(j2fVar);
            return;
        }
        while (true) {
            h2f h2fVar = (h2f) arrayDeque.peek();
            if (h2fVar == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    h2fVar.toString();
                }
                h2fVar.a(j2fVar.c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Objects.toString(componentName);
                }
            } catch (RemoteException unused2) {
                Objects.toString(componentName);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(j2fVar);
    }

    public final void b(j2f j2fVar) {
        ComponentName componentName = j2fVar.a;
        ArrayDeque arrayDeque = j2fVar.d;
        Handler handler = this.b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = j2fVar.e + 1;
        j2fVar.e = i;
        if (i <= 6) {
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << r3) * 1000);
            return;
        }
        arrayDeque.size();
        Objects.toString(componentName);
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        ata ataVar = null;
        if (i == 0) {
            h2f h2fVar = (h2f) message.obj;
            String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
            synchronized (l2f.c) {
                if (string != null) {
                    if (!string.equals(l2f.d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet2 = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet2.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        l2f.e = hashSet2;
                        l2f.d = string;
                    }
                }
                hashSet = l2f.e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            componentName.toString();
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!this.c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName2);
                        }
                        this.c.put(componentName2, new j2f(componentName2));
                    }
                }
                Iterator it2 = this.c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        j2f j2fVar = (j2f) entry.getValue();
                        if (j2fVar.b) {
                            this.a.unbindService(this);
                            j2fVar.b = false;
                        }
                        j2fVar.c = null;
                        it2.remove();
                    }
                }
            }
            for (j2f j2fVar2 : this.c.values()) {
                j2fVar2.d.add(h2fVar);
                a(j2fVar2);
            }
        } else if (i == 1) {
            i2f i2fVar = (i2f) message.obj;
            ComponentName componentName3 = i2fVar.a;
            IBinder iBinder = i2fVar.b;
            j2f j2fVar3 = (j2f) this.c.get(componentName3);
            if (j2fVar3 != null) {
                int i2 = zsa.a;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ata.ep);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ata)) {
                        ysa ysaVar = new ysa();
                        ysaVar.a = iBinder;
                        ataVar = ysaVar;
                    } else {
                        ataVar = (ata) iInterfaceQueryLocalInterface;
                    }
                }
                j2fVar3.c = ataVar;
                j2fVar3.e = 0;
                a(j2fVar3);
                return true;
            }
        } else if (i == 2) {
            j2f j2fVar4 = (j2f) this.c.get((ComponentName) message.obj);
            if (j2fVar4 != null) {
                if (j2fVar4.b) {
                    this.a.unbindService(this);
                    j2fVar4.b = false;
                }
                j2fVar4.c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            j2f j2fVar5 = (j2f) this.c.get((ComponentName) message.obj);
            if (j2fVar5 != null) {
                a(j2fVar5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(1, new i2f(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(2, componentName).sendToTarget();
    }
}
