#import <Foundation/Foundation.h>

#if __has_attribute(swift_private)
#define AC_SWIFT_PRIVATE __attribute__((swift_private))
#else
#define AC_SWIFT_PRIVATE
#endif

/// The "fox" asset catalog image resource.
static NSString * const ACImageNameFox AC_SWIFT_PRIVATE = @"fox";

/// The "lion" asset catalog image resource.
static NSString * const ACImageNameLion AC_SWIFT_PRIVATE = @"lion";

/// The "monkey" asset catalog image resource.
static NSString * const ACImageNameMonkey AC_SWIFT_PRIVATE = @"monkey";

/// The "pig" asset catalog image resource.
static NSString * const ACImageNamePig AC_SWIFT_PRIVATE = @"pig";

#undef AC_SWIFT_PRIVATE