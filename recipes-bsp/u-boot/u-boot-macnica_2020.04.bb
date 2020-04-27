require recipes-bsp/u-boot/u-boot-macnica-common.inc
require recipes-bsp/u-boot/u-boot.inc

RV1108_DDR = "rv110x_ddr3_v1.07.bin"

DEPENDS += "bc-native dtc-native"

SRC_URI += "file://${RV1108_DDR}"

do_deploy_append() {
    ${B}/tools/mkimage -n rv1108 -T rksd -d ${WORKDIR}/${RV1108_DDR} ${B}/spl.bin
    cat ${B}/spl.bin ${B}/u-boot.bin > ${DEPLOYDIR}/u-boot.img
}
