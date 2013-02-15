DESCRIPTION = "A PC-side Library designed to encapsulate all low level Bootstrap Loader (BSL) commands and common functions"
HOMEPAGE = "http://github.com/MSP-LaneWestlund/MSPBSL_Library"
SECTION = "libs"
LICENSE = "LGPLv2.1+"
DEPENDS = "boost hidapi"
COMPATIBLE_MACHINE = "trickr2e"
S="${WORKDIR}/git"
SRCREV="${AUTOREV}"

SRC_URI ="git://git@tklab.math.spbu.ru/mspbsl_library.git;protocol=ssh"

LIC_FILES_CHKSUM="file://LICENSE.txt;beginline=1;endline=355;md5=fd140d36d9ffcb0548c8c21659083810"


inherit cmake
EXTRA_OECMAKE ="-DLIB_INSTALL_DIR=${libdir} -DLIBEXEC_INSTALL_DIR=${libexecdir}"

FILES_${PN} = "${libdir}/libmslbsp.a"

