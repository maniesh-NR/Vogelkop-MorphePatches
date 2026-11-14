package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class tod extends MediaSession.Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tod(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final xod a() {
        xod xodVar;
        r22 r22Var;
        synchronized (((r22) this.b).a) {
            xodVar = (xod) ((WeakReference) ((r22) this.b).c).get();
        }
        if (xodVar == null) {
            return null;
        }
        r22 r22Var2 = (r22) this.b;
        synchronized (xodVar.d) {
            r22Var = xodVar.l;
        }
        if (r22Var2 == r22Var) {
            return xodVar;
        }
        return null;
    }

    public final yod b() {
        yod yodVar;
        uod uodVar;
        synchronized (((uod) this.b).mLock) {
            yodVar = (yod) ((uod) this.b).mSessionImpl.get();
        }
        if (yodVar == null) {
            return null;
        }
        uod uodVar2 = (uod) this.b;
        synchronized (yodVar.d) {
            uodVar = yodVar.i;
        }
        if (uodVar2 == uodVar) {
            return yodVar;
        }
        return null;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        g2n g2nVar;
        g2n g2nVar2;
        zod zodVar = null;
        switch (this.a) {
            case 0:
                yod yodVarB = b();
                if (yodVarB != null) {
                    cpd.a(bundle);
                    try {
                        if (!str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                            if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                                ((uod) this.b).onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                                return;
                            }
                            if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                                ((uod) this.b).onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                                return;
                            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                                ((uod) this.b).onRemoveQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                                return;
                            } else {
                                if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                                    return;
                                }
                                ((uod) this.b).onCommand(str, bundle, resultReceiver);
                                return;
                            }
                        }
                        Bundle bundle2 = new Bundle();
                        MediaSessionCompat$Token mediaSessionCompat$Token = yodVarB.c;
                        usa usaVarA = mediaSessionCompat$Token.a();
                        bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", usaVarA == null ? null : usaVarA.asBinder());
                        synchronized (mediaSessionCompat$Token.a) {
                            try {
                                g2nVar = mediaSessionCompat$Token.d;
                            } finally {
                            }
                        }
                        if (g2nVar == null) {
                            bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", null);
                        } else {
                            Bundle bundle3 = new Bundle();
                            bundle3.putParcelable("a", new ParcelImpl(g2nVar));
                            bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                        }
                        resultReceiver.send(0, bundle2);
                        return;
                    } catch (BadParcelableException unused) {
                        return;
                    }
                }
                return;
            default:
                xod xodVarA = a();
                if (xodVarA != null) {
                    bpd.v(bundle);
                    try {
                        if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                            if (resultReceiver != null) {
                                Bundle bundle4 = new Bundle();
                                apd apdVar = xodVarA.c;
                                tsa tsaVarA = apdVar.a();
                                bundle4.putBinder("android.support.v4.media.session.EXTRA_BINDER", tsaVarA == null ? null : tsaVarA.asBinder());
                                synchronized (apdVar.a) {
                                    try {
                                        g2nVar2 = apdVar.d;
                                    } finally {
                                    }
                                }
                                if (g2nVar2 == null) {
                                    bundle4.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", null);
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putParcelable("a", new ParcelImpl(g2nVar2));
                                    bundle4.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle5);
                                }
                                resultReceiver.send(0, bundle4);
                                return;
                            }
                            return;
                        }
                        if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                            if (bundle != null) {
                                ((r22) this.b).j((mid) qyn.u(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), mid.CREATOR));
                                return;
                            }
                            return;
                        }
                        if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                            if (bundle != null) {
                                ((r22) this.b).k((mid) qyn.u(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), mid.CREATOR), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                                return;
                            }
                            return;
                        }
                        if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                            if (bundle != null) {
                                ((r22) this.b).A((mid) qyn.u(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), mid.CREATOR));
                                return;
                            }
                            return;
                        } else {
                            if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                                ((r22) this.b).m(str, bundle, resultReceiver);
                                return;
                            }
                            ArrayList arrayList = xodVarA.h;
                            if (arrayList == null || bundle == null) {
                                return;
                            }
                            int i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                            if (i >= 0 && i < arrayList.size()) {
                                zodVar = (zod) arrayList.get(i);
                            }
                            if (zodVar != null) {
                                ((r22) this.b).A(zodVar.a);
                                return;
                            }
                            return;
                        }
                    } catch (BadParcelableException unused2) {
                        w7d.q("Could not unparcel the extra data.");
                        return;
                    }
                }
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                uod uodVar = (uod) obj;
                if (b() != null) {
                    cpd.a(bundle);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                            Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            cpd.a(bundle2);
                            uodVar.onPlayFromUri(uri, bundle2);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                            uodVar.onPrepare();
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                            Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            cpd.a(bundle3);
                            uodVar.onPrepareFromMediaId(string, bundle3);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                            Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            cpd.a(bundle4);
                            uodVar.onPrepareFromSearch(string2, bundle4);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                            Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            cpd.a(bundle5);
                            uodVar.onPrepareFromUri(uri2, bundle5);
                        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            uodVar.onSetCaptioningEnabled(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            uodVar.onSetRepeatMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            uodVar.onSetShuffleMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                            RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                            Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            cpd.a(bundle6);
                            uodVar.onSetRating(ratingCompat, bundle6);
                        } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            uodVar.onSetPlaybackSpeed(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                        } else {
                            uodVar.onCustomAction(str, bundle);
                        }
                        break;
                    } catch (BadParcelableException unused) {
                        return;
                    }
                }
                break;
            default:
                r22 r22Var = (r22) obj;
                if (a() != null) {
                    bpd.v(bundle);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            if (bundle != null) {
                                Uri uri3 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                                Bundle bundle7 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                                bpd.v(bundle7);
                                r22Var.v(uri3, bundle7);
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                            r22Var.w();
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            if (bundle != null) {
                                String string3 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                                Bundle bundle8 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                                bpd.v(bundle8);
                                r22Var.x(string3, bundle8);
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            if (bundle != null) {
                                String string4 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                                Bundle bundle9 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                                bpd.v(bundle9);
                                r22Var.y(string4, bundle9);
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            if (bundle != null) {
                                Uri uri4 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                                Bundle bundle10 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                                bpd.v(bundle10);
                                r22Var.z(uri4, bundle10);
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            if (bundle != null) {
                                bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            if (bundle != null) {
                                r22Var.G(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            if (bundle != null) {
                                r22Var.H(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                            if (bundle != null) {
                                yjh yjhVar = (yjh) qyn.u(bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), yjh.CREATOR);
                                bpd.v(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                                r22Var.F(yjhVar);
                            }
                        } else if (!str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            r22Var.n(str, bundle);
                        } else if (bundle != null) {
                            r22Var.D(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                        }
                        break;
                    } catch (BadParcelableException unused2) {
                        w7d.q("Could not unparcel the data.");
                        return;
                    }
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (b() != null) {
                    ((uod) obj).onFastForward();
                    break;
                }
                break;
            default:
                if (a() != null) {
                    ((r22) obj).o();
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (b() == null || (!((uod) obj).onMediaButtonEvent(intent) && !super.onMediaButtonEvent(intent))) {
                    break;
                }
                break;
            default:
                if (a() == null || (!((r22) obj).q(intent) && !super.onMediaButtonEvent(intent))) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (b() != null) {
                    ((uod) obj).onPause();
                    break;
                }
                break;
            default:
                if (a() != null) {
                    ((r22) obj).r();
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (b() != null) {
                    ((uod) obj).onPlay();
                    break;
                }
                break;
            default:
                if (a() != null) {
                    ((r22) obj).s();
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (b() != null) {
                    cpd.a(bundle);
                    ((uod) obj).onPlayFromMediaId(str, bundle);
                    break;
                }
                break;
            default:
                if (a() != null) {
                    bpd.v(bundle);
                    ((r22) obj).t(str, bundle);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (b() != null) {
                    cpd.a(bundle);
                    ((uod) obj).onPlayFromSearch(str, bundle);
                    break;
                }
                break;
            default:
                if (a() != null) {
                    bpd.v(bundle);
                    ((r22) obj).u(str, bundle);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (b() != null) {
                    cpd.a(bundle);
                    ((uod) obj).onPlayFromUri(uri, bundle);
                    break;
                }
                break;
            default:
                if (a() != null) {
                    bpd.v(bundle);
                    ((r22) obj).v(uri, bundle);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (b() != null) {
                    ((uod) obj).onPrepare();
                    break;
                }
                break;
            default:
                if (a() != null) {
                    ((r22) obj).w();
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (b() != null) {
                    cpd.a(bundle);
                    ((uod) obj).onPrepareFromMediaId(str, bundle);
                    break;
                }
                break;
            default:
                if (a() != null) {
                    bpd.v(bundle);
                    ((r22) obj).x(str, bundle);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (b() != null) {
                    cpd.a(bundle);
                    ((uod) obj).onPrepareFromSearch(str, bundle);
                    break;
                }
                break;
            default:
                if (a() != null) {
                    bpd.v(bundle);
                    ((r22) obj).y(str, bundle);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (b() != null) {
                    cpd.a(bundle);
                    ((uod) obj).onPrepareFromUri(uri, bundle);
                    break;
                }
                break;
            default:
                if (a() != null) {
                    bpd.v(bundle);
                    ((r22) obj).z(uri, bundle);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (b() != null) {
                    ((uod) obj).onRewind();
                    break;
                }
                break;
            default:
                if (a() != null) {
                    ((r22) obj).B();
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (b() != null) {
                    ((uod) obj).onSeekTo(j);
                    break;
                }
                break;
            default:
                if (a() != null) {
                    ((r22) obj).C(j);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (b() != null) {
                    ((uod) obj).onSetPlaybackSpeed(f);
                    break;
                }
                break;
            default:
                if (a() != null) {
                    ((r22) obj).D(f);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        RatingCompat ratingCompat;
        float f;
        yjh yjhVar;
        yjh yjhVarD;
        byte b = this.a;
        RatingCompat ratingCompat2 = null;
        yjhVar = null;
        yjhVar = null;
        yjh yjhVar2 = null;
        ratingCompat2 = null;
        ratingCompat2 = null;
        ratingCompat2 = null;
        ratingCompat2 = null;
        ratingCompat2 = null;
        ratingCompat2 = null;
        ratingCompat2 = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (b() != null) {
                    uod uodVar = (uod) obj;
                    if (rating != null) {
                        int ratingStyle = rating.getRatingStyle();
                        if (!rating.isRated()) {
                            switch (ratingStyle) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    ratingCompat2 = new RatingCompat(ratingStyle, -1.0f);
                                    break;
                            }
                        } else {
                            switch (ratingStyle) {
                                case 1:
                                    ratingCompat = new RatingCompat(1, rating.hasHeart() ? 1.0f : 0.0f);
                                    break;
                                case 2:
                                    ratingCompat = new RatingCompat(2, rating.isThumbUp() ? 1.0f : 0.0f);
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    float starRating = rating.getStarRating();
                                    if (ratingStyle == 3) {
                                        f = 3.0f;
                                    } else if (ratingStyle == 4) {
                                        f = 4.0f;
                                    } else if (ratingStyle == 5) {
                                        f = 5.0f;
                                    }
                                    if (starRating >= 0.0f && starRating <= f) {
                                        ratingCompat2 = new RatingCompat(ratingStyle, starRating);
                                        break;
                                    }
                                    break;
                                case 6:
                                    float percentRating = rating.getPercentRating();
                                    if (percentRating >= 0.0f && percentRating <= 100.0f) {
                                        ratingCompat2 = new RatingCompat(6, percentRating);
                                        break;
                                    }
                                    break;
                            }
                            ratingCompat2 = ratingCompat;
                        }
                        ratingCompat2.getClass();
                    }
                    uodVar.onSetRating(ratingCompat2);
                    break;
                }
                break;
            default:
                if (a() != null) {
                    r22 r22Var = (r22) obj;
                    if (rating != null) {
                        int ratingStyle2 = rating.getRatingStyle();
                        if (!rating.isRated()) {
                            switch (ratingStyle2) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    yjhVar2 = new yjh(ratingStyle2, -1.0f);
                                    break;
                            }
                        } else {
                            switch (ratingStyle2) {
                                case 1:
                                    yjhVar = new yjh(1, rating.hasHeart() ? 1.0f : 0.0f);
                                    break;
                                case 2:
                                    yjhVar = new yjh(2, rating.isThumbUp() ? 1.0f : 0.0f);
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    yjhVarD = yjh.d(rating.getStarRating(), ratingStyle2);
                                    yjhVar2 = yjhVarD;
                                    break;
                                case 6:
                                    yjhVarD = yjh.c(rating.getPercentRating());
                                    yjhVar2 = yjhVarD;
                                    break;
                            }
                            yjhVar2 = yjhVar;
                        }
                        yjhVar2.getClass();
                        yjhVar2.c = rating;
                    }
                    r22Var.E(yjhVar2);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (b() != null) {
                    ((uod) obj).onSkipToNext();
                    break;
                }
                break;
            default:
                if (a() != null) {
                    ((r22) obj).I();
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (b() != null) {
                    ((uod) obj).onSkipToPrevious();
                    break;
                }
                break;
            default:
                if (a() != null) {
                    ((r22) obj).J();
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (b() != null) {
                    ((uod) obj).onSkipToQueueItem(j);
                    break;
                }
                break;
            default:
                if (a() != null) {
                    ((r22) obj).K(j);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (b() != null) {
                    ((uod) obj).onStop();
                    break;
                }
                break;
            default:
                if (a() != null) {
                    ((r22) obj).L();
                    break;
                }
                break;
        }
    }
}
