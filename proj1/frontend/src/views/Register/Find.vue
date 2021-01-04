<template>
    <div>
        <find-id-page/>
        <find-pw-page/>
    </div>
</template>

<script>
import FindIdPage from '@/components/Register/FindIdPage.vue'
import FindPwPage from '@/components/Register/FindPwPage.vue'

export default {
  name: "Find",
  components: {
    FindIdPage,
    FindPwPage
  }
};
</script>
