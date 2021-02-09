#include <stdio.h>

enum message_type_t {
  DATA_MESSAGE = 0,
  CONTROL_MESSAGE,
};

enum control_message_type_t {
  GW_ANNOUNCEMENT = 0,
};

typedef struct {
  control_message_type_t type;
  uint32_t source;
} control_message_t;

typedef struct {
  message_type_t type;

  union {
    layer2_data_t layer2;
    control_message_t control;
  } data;

} message_t;
