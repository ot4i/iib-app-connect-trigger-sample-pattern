<?php 
	$pim = $_MB["PATTERN_INSTANCE_MANAGER"]; 
?>
swagger: '2.0'
info:
  title: <?php echo $_MB['PP']['ppInterfaceTitle'] . "\n";?>
  description: <?php echo $_MB['PP']['ppInterfaceDescription'] . "\n";?>
  version: 1.0.0
host: <?php echo $_MB['PP']['ppHostname'] . "\n";?>
schemes:
  - <?php echo $_MB['PP']['ppHTTPorHTTPS'] . "\n";?>
basePath: /
produces:
  - application/json

x-hooks:
  <?php echo $_MB['PP']['ppInterfaceTitle'] .":\n"; ?>
    description: Events originating from the <?php echo $_MB['PP']['ppInterfaceTitle'] . " application\n"; ?>
    x-register-subscription:   <?php echo $_MB['PP']['ppInterfaceTitle']; ?>SubscribeOperation
    x-list-all-subscriptions:  <?php echo $_MB['PP']['ppInterfaceTitle']; ?>SubscriptionListOperation
    x-deregister-subscription: <?php echo $_MB['PP']['ppInterfaceTitle']; ?>UnsubscribeOperation
    x-change-subscription:     <?php echo $_MB['PP']['ppInterfaceTitle']; ?>ChangeSubscribeOperation
    x-retrieve-subscription:   <?php echo $_MB['PP']['ppInterfaceTitle']; ?>RetrieveSubscribeOperation
    x-events:
      <?php echo $_MB['PP']['ppTrigger1Name'].":\n"; ?>
        description: '<?php echo $_MB['PP']['ppTrigger1Description'] . "'\n"; ?>
        x-eventId: <?php echo "'" . $_MB['PP']['ppInterfaceTitle']; ?><?php echo $_MB['PP']['ppTrigger1Name']."'\n"; ?>
        parameters:
            - name: event
              in: body
              required: true
              schema:
                $ref: '#/definitions/<?php echo $_MB['PP']['ppTrigger1Name']; ?>'

paths:
  <?php echo $_MB['PP']['ppWebhookURLFragment'].":\n"; ?>
    post:
      operationId: '<?php echo $_MB['PP']['ppInterfaceTitle']; ?>SubscribeOperation'
      summary: Create a subscription to webhook for <?php echo $_MB['PP']['ppInterfaceTitle']."\n"; ?>
      description: |
        Call this API to create a new subscription on the webhook. Provide a list of events to subscribe for and a HTTP callback URL.
      parameters:
        - name: subscription
          in: body
          description: Details to subscribe for a callback on a given set of events
          required: true
          schema:
            $ref: '#/definitions/Subscription'

      tags:
        - Webhook
      responses:
        '202':
          description: Details of the subscription created to the webhook
          schema:
            $ref: '#/definitions/Subscribe_response'

    get:
      operationId: '<?php echo $_MB['PP']['ppInterfaceTitle']; ?>SubscriptionListOperation'
      summary: Get a list of subscriptions on webhook for <?php echo $_MB['PP']['ppInterfaceTitle']."\n"; ?>
      description: |
        Call this API to get a list of subscriptions defined for this webhook
      tags:
        - Webhook
      responses:
        '200':
          description: Ids of all subscriptions setup for this webhook
          schema:
            type: array
            items:
              type: string

  <?php echo $_MB['PP']['ppWebhookURLFragment']."/{id}:\n"; ?>
    delete:
      operationId: '<?php echo $_MB['PP']['ppInterfaceTitle']; ?>UnsubscribeOperation'
      summary: Delete a subscription to the webhook for <?php echo $_MB['PP']['ppInterfaceTitle']."\n"; ?>
      description: |
        Call this API to delete a subscription call id on the webhook.
      parameters:
        - name: id
          in: path
          description: Subscription to delete
          required: true
          type: number
      tags:
        - Webhook
      responses:
        '204':
          description: Details of the subscription created to the webhook

    get:
      operationId: '<?php echo $_MB['PP']['ppInterfaceTitle']; ?>RetrieveSubscribeOperation'
      summary: Get details of a subscription to the webhook for <?php echo $_MB['PP']['ppInterfaceTitle']."\n"; ?>
      description: |
        Call this API to get details of a subscription for this webhook
      parameters:
        - name: id
          in: path
          description: Subscription to get
          required: true
          type: number
      tags:
        - Webhook
      responses:
        '200':
          description: Details of the subscription created to the webhook
          schema:
            $ref: '#/definitions/Subscription'

    put:
      operationId: '<?php echo $_MB['PP']['ppInterfaceTitle']; ?>ChangeSubscribeOperation'
      summary: Change details of a subscription to the webhook for <?php echo $_MB['PP']['ppInterfaceTitle']."\n"; ?>
      description: |
        Call this API to change details of a subscription for this webhook
      parameters:
        - name: id
          in: path
          description: Subscription to change
          required: true
          type: string
        - name: subscription
          in: body
          description: New subscription details
          required: true
          schema:
            $ref: '#/definitions/Subscription'
      tags:
        - Webhook
      responses:
        '204':
          description: Change successful

definitions:
  Subscription:
    type: object
    properties:
      callback:
        $ref: '#/definitions/Callback_details'
        description: 'Details about how to callback when an event occurs'
      event_types:
        type: array
        items:
          type: string

  Callback_details:
    type: object
    properties:
      url:
        type: string
        description: 'url to callback on'
      secret:
        type: string
        description: 'secret to use in callback'

  Subscribe_response:
    type: object
    properties:
      id:
        type: number
        description: 'Unique identifier representing the subscription to the webhook'

  <?php echo $_MB['PP']['ppTrigger1Name'].":"."\n"; ?>
    type: object
    properties:
<?php 
	$table = $pim->getParameterTable("ppTrigger1Fields");
	$count = $table->getRowCount();
	for ($j=0;$j<$count ;$j++ ) {
		echo "      ".$_MB['PP']['ppTrigger1Fields'][$j]['fieldName'].":\n";
		echo "        type:  string\n";
	} 
?>
