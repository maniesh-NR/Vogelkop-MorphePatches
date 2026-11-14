package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class cpd {
    public final yod a;
    public final z8b b;
    public final ArrayList c = new ArrayList();

    public cpd(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        ComponentName componentName2 = null;
        if (context == null) {
            qp2.o("context must not be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            qp2.o("tag must not be null or empty");
            throw null;
        }
        if (componentName == null) {
            int i = f0l.b;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers.size() == 1) {
                ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
                componentName2 = new ComponentName(activityInfo.packageName, activityInfo.name);
            } else {
                listQueryBroadcastReceivers.size();
            }
            componentName = componentName2;
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        yod yodVar = new yod(context, str);
        this.a = yodVar;
        c(new rod(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        yodVar.a.setMediaButtonReceiver(pendingIntent);
        this.b = new z8b(context, yodVar.c);
    }

    public cpd(Context context, yod yodVar) {
        this.a = yodVar;
        this.b = new z8b(context, yodVar.c);
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(cpd.class.getClassLoader());
        }
    }

    public final void b(boolean z) {
        this.a.a.setActive(z);
        Iterator it = this.c.iterator();
        if (it.hasNext()) {
            throw p3p.g(it);
        }
    }

    public final void c(uod uodVar, Handler handler) {
        yod yodVar = this.a;
        if (uodVar == null) {
            yodVar.a(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        yodVar.a(uodVar, handler);
    }

    public final void d(MediaMetadataCompat mediaMetadataCompat) {
        yod yodVar = this.a;
        yodVar.h = mediaMetadataCompat;
        MediaSession mediaSession = yodVar.a;
        Bundle bundle = mediaMetadataCompat.a;
        MediaMetadata mediaMetadataBuild = mediaMetadataCompat.b;
        if (mediaMetadataBuild == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) MediaMetadataCompat.d.get(str);
                if (num == null) {
                    num = -1;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    builder.putLong(str, bundle.getLong(str, 0L));
                } else if (iIntValue == 1) {
                    builder.putText(str, bundle.getCharSequence(str));
                } else if (iIntValue == 2) {
                    builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                } else if (iIntValue != 3) {
                    Object obj = bundle.get(str);
                    if (obj == null || (obj instanceof CharSequence)) {
                        builder.putText(str, (CharSequence) obj);
                    } else if (obj instanceof Long) {
                        builder.putLong(str, ((Long) obj).longValue());
                    } else if (obj instanceof Bitmap) {
                        builder.putBitmap(str, (Bitmap) obj);
                    } else if (obj instanceof Rating) {
                        builder.putRating(str, (Rating) obj);
                    }
                } else {
                    builder.putRating(str, (Rating) bundle.getParcelable(str));
                }
            }
            mediaMetadataBuild = builder.build();
            mediaMetadataCompat.b = mediaMetadataBuild;
        }
        mediaSession.setMetadata(mediaMetadataBuild);
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:480)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:381)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:90)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:372)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    public final void e(android.support.v4.media.session.PlaybackStateCompat r10) {
        /*
            r9 = this;
            yod r9 = r9.a
            r9.g = r10
            java.lang.Object r1 = r9.d
            monitor-enter(r1)
            android.os.RemoteCallbackList r0 = r9.f     // Catch: java.lang.Throwable -> L8b
            int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L8b
            int r0 = r0 + (-1)
        Lf:
            android.os.RemoteCallbackList r2 = r9.f     // Catch: java.lang.Throwable -> L8b
            if (r0 < 0) goto L1f
            android.os.IInterface r2 = r2.getBroadcastItem(r0)     // Catch: java.lang.Throwable -> L8b
            osa r2 = (defpackage.osa) r2     // Catch: java.lang.Throwable -> L8b
            r2.N0(r10)     // Catch: android.os.RemoteException -> L1c java.lang.Throwable -> L8b
        L1c:
            int r0 = r0 + (-1)
            goto Lf
        L1f:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            android.media.session.MediaSession r9 = r9.a
            android.media.session.PlaybackState r0 = r10.l
            if (r0 != 0) goto L85
            android.media.session.PlaybackState$Builder r1 = new android.media.session.PlaybackState$Builder
            r1.<init>()
            int r2 = r10.a
            long r3 = r10.b
            float r5 = r10.d
            long r6 = r10.h
            r1.setState(r2, r3, r5, r6)
            long r2 = r10.c
            r1.setBufferedPosition(r2)
            long r2 = r10.e
            r1.setActions(r2)
            java.lang.CharSequence r0 = r10.g
            r1.setErrorMessage(r0)
            java.util.ArrayList r0 = r10.i
            int r2 = r0.size()
            r3 = 0
        L4f:
            if (r3 >= r2) goto L75
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r4 = (android.support.v4.media.session.PlaybackStateCompat.CustomAction) r4
            android.media.session.PlaybackState$CustomAction r5 = r4.e
            if (r5 != 0) goto L71
            java.lang.String r5 = r4.a
            java.lang.CharSequence r6 = r4.b
            int r7 = r4.c
            android.media.session.PlaybackState$CustomAction$Builder r8 = new android.media.session.PlaybackState$CustomAction$Builder
            r8.<init>(r5, r6, r7)
            android.os.Bundle r4 = r4.d
            r8.setExtras(r4)
            android.media.session.PlaybackState$CustomAction r5 = r8.build()
        L71:
            r1.addCustomAction(r5)
            goto L4f
        L75:
            long r2 = r10.j
            r1.setActiveQueueItemId(r2)
            android.os.Bundle r0 = r10.k
            r1.setExtras(r0)
            android.media.session.PlaybackState r0 = r1.build()
            r10.l = r0
        L85:
            r9.setPlaybackState(r0)
            return
        L89:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            throw r9
        L8b:
            r0 = move-exception
            r9 = r0
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpd.e(android.support.v4.media.session.PlaybackStateCompat):void");
    }
}
