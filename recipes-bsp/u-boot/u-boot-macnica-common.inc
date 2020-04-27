HOMEPAGE = "https://github.com/MacnicaDHW/u-boot"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"

DEPENDS += "flex-native bison-native"

SRCREV = "5d9528f5d9587cfb2400b0b5c3e9fc3534f43aef"
SRCBRANCH = "2020.04+macnica"
SRC_URI = "git://git@github.com/MacnicaDHW/u-boot;branch=${SRCBRANCH};protocol=ssh"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"
do_configure[cleandirs] = "${B}"

COMPATIBLE_MACHINE = "(rv1108)"
