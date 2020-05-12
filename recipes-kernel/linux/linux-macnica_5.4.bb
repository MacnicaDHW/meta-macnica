HOMEPAGE = "https://github.com/MacnicaDHW/linux"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

DEPENDS += "flex-native lz4-native"

inherit kernel

SRCREV = "8321db74eb2dc3e15650eed006ac1de1d33b962b"
SRCBRANCH = "5.4.x+macnica"
SRC_URI = "git://git@github.com/MacnicaDHW/linux.git;branch=${SRCBRANCH};protocol=ssh"

S = "${WORKDIR}/git"

do_configure_prepend() {
    cp ${S}/arch/arm/configs/macnicadhw_defconfig ${WORKDIR}/defconfig
}

COMPATIBLE_MACHINE = "(rv1108)"
