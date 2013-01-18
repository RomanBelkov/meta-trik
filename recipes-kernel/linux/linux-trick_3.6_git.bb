inherit kernel
SECTION = "Kernel"
DESCRIPTION = "Linux Kernel for DaVinci Trick linux"
LICENSE = "GPLv2"
KERNEL_IMAGETYPE = "uImage"


#require recipes-kernel/linux/multi-kernel.inc
#require recipes-kernel/linux/tipspkernel.inc
KERNEL_VERSION ="3.6.7"
S="${WORKDIR}/git"

MULTI_CONFIG_BASE_SUFFIX = ""

BRANCH = "nyrl_lcd_ili9340"

COMPATIBLE_MACHINE = "trickr2e"

SRCREV="${AUTOREV}"

SRC_URI = "git://git@tklab.math.spbu.ru/trick_linux_3_6.git;protocol=ssh;branch=${BRANCH} \
	    file://defconfig"
LIC_FILES_CHKSUM="file://COPYING;beginline=1;endline=355;md5=bad9197b13faffd10dfc69bd78fd072e"

#do_fetch[no_exec] ="1"
