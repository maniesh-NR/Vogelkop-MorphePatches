package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public enum zzrn implements zzfc {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(NotificationCompat.FLAG_HIGH_PRIORITY),
    FORMAT_QR_CODE(NotificationCompat.FLAG_LOCAL_ONLY),
    FORMAT_UPC_A(NotificationCompat.FLAG_GROUP_SUMMARY),
    FORMAT_UPC_E(1024),
    FORMAT_PDF417(2048),
    FORMAT_AZTEC(4096);

    private final int zzp;

    zzrn(int i) {
        this.zzp = i;
    }

    public final int zza() {
        return this.zzp;
    }
}
