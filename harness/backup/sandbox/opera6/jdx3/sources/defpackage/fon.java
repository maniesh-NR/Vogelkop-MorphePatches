package defpackage;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class fon extends gv9 implements svd {
    private static final fon DEFAULT_INSTANCE;
    public static final int ENABLED_DEBUG_NOTIFICATIONS_FIELD_NUMBER = 5;
    public static final int FCM_TOPICS_FIELD_NUMBER = 2;
    public static final int HAS_REQUESTED_NOTIFICATION_PERMISSION_FIELD_NUMBER = 6;
    public static final int LAST_GEOLOCATION_FIELD_NUMBER = 8;
    public static final int LOCATION_MODE_FIELD_NUMBER = 7;
    public static final int MINIMAL_WEATHER_DATA_FIELD_NUMBER = 1;
    private static volatile p1g PARSER = null;
    public static final int SELECTED_LOCATION_FIELD_NUMBER = 3;
    public static final int SELECTED_TEMPERATURE_UNIT_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean enabledDebugNotifications_;
    private ffb fcmTopics_ = gv9.emptyProtobufList();
    private boolean hasRequestedNotificationPermission_;
    private vv9 lastGeolocation_;
    private int locationMode_;
    private q0e minimalWeatherData_;
    private fxc selectedLocation_;
    private int selectedTemperatureUnit_;

    static {
        fon fonVar = new fon();
        DEFAULT_INSTANCE = fonVar;
        gv9.registerDefaultInstance(fon.class, fonVar);
    }

    public static fon g() {
        return DEFAULT_INSTANCE;
    }

    public static fon s(InputStream inputStream) {
        return (fon) gv9.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public final void b(Iterable iterable) {
        ffb ffbVar = this.fcmTopics_;
        if (!ffbVar.isModifiable()) {
            this.fcmTopics_ = gv9.mutableCopy(ffbVar);
        }
        w5.addAll(iterable, this.fcmTopics_);
    }

    public final void c() {
        this.fcmTopics_ = gv9.emptyProtobufList();
    }

    public final void d() {
        this.lastGeolocation_ = null;
        this.bitField0_ &= -65;
    }

    public final Object dynamicMethod(gv9$f gv9_f, Object obj, Object obj2) {
        b bVar;
        switch (don.a[gv9_f.ordinal()]) {
            case 1:
                return new fon();
            case 2:
                return new eon(DEFAULT_INSTANCE);
            case 3:
                return gv9.newMessageInfo(DEFAULT_INSTANCE, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ț\u0003ဉ\u0001\u0004ဌ\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဌ\u0005\bဉ\u0006", new Object[]{"bitField0_", "minimalWeatherData_", "fcmTopics_", "selectedLocation_", "selectedTemperatureUnit_", "enabledDebugNotifications_", "hasRequestedNotificationPermission_", "locationMode_", "lastGeolocation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p1g p1gVar = PARSER;
                if (p1gVar != null) {
                    return p1gVar;
                }
                synchronized (fon.class) {
                    bVar = PARSER;
                    if (bVar == null) {
                        bVar = new b(DEFAULT_INSTANCE);
                        PARSER = bVar;
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public final void e() {
        this.selectedLocation_ = null;
        this.bitField0_ &= -3;
    }

    public final void f() {
        this.bitField0_ &= -5;
        this.selectedTemperatureUnit_ = 0;
    }

    public final boolean h() {
        return this.enabledDebugNotifications_;
    }

    public final ffb i() {
        return this.fcmTopics_;
    }

    public final boolean j() {
        return this.hasRequestedNotificationPermission_;
    }

    public final vv9 k() {
        vv9 vv9Var = this.lastGeolocation_;
        return vv9Var == null ? vv9.b() : vv9Var;
    }

    public final zxc l() {
        int i = this.locationMode_;
        zxc zxcVar = i != 0 ? i != 1 ? i != 2 ? null : zxc.LOCATION_MODE_MANUAL : zxc.LOCATION_MODE_AUTO : zxc.LOCATION_MODE_UNSPECIFIED;
        return zxcVar == null ? zxc.UNRECOGNIZED : zxcVar;
    }

    public final q0e m() {
        q0e q0eVar = this.minimalWeatherData_;
        return q0eVar == null ? q0e.c() : q0eVar;
    }

    public final fxc n() {
        fxc fxcVar = this.selectedLocation_;
        return fxcVar == null ? fxc.b() : fxcVar;
    }

    public final del o() {
        int i = this.selectedTemperatureUnit_;
        del delVar = i != 0 ? i != 1 ? i != 2 ? null : del.TEMPERATURE_UNIT_FAHRENHEIT : del.TEMPERATURE_UNIT_CELSIUS : del.TEMPERATURE_UNIT_UNSPECIFIED;
        return delVar == null ? del.UNRECOGNIZED : delVar;
    }

    public final boolean p() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final void t(boolean z) {
        this.bitField0_ |= 8;
        this.enabledDebugNotifications_ = z;
    }

    public final void u(boolean z) {
        this.bitField0_ |= 16;
        this.hasRequestedNotificationPermission_ = z;
    }

    public final void v(vv9 vv9Var) {
        vv9Var.getClass();
        this.lastGeolocation_ = vv9Var;
        this.bitField0_ |= 64;
    }

    public final void w(zxc zxcVar) {
        this.locationMode_ = zxcVar.getNumber();
        this.bitField0_ |= 32;
    }

    public final void x(q0e q0eVar) {
        q0eVar.getClass();
        this.minimalWeatherData_ = q0eVar;
        this.bitField0_ |= 1;
    }

    public final void y(fxc fxcVar) {
        fxcVar.getClass();
        this.selectedLocation_ = fxcVar;
        this.bitField0_ |= 2;
    }

    public final void z(del delVar) {
        this.selectedTemperatureUnit_ = delVar.getNumber();
        this.bitField0_ |= 4;
    }
}
